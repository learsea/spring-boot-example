package com.midea.jr.ecf.channel.front.common.common.aspect;

import java.lang.reflect.Method;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.midea.config.util.JsonUtils;
import com.midea.jr.commons.beans.ResponseData;
import com.midea.jr.ecf.channel.front.common.common.exception.ServiceException;

/**
 * @author csy
 * @description 处理控制层日志和异常
 * @date 2018-4-11
 */
@Aspect
public class ControllerAspect {

	private static final Logger loger = LoggerFactory.getLogger( ControllerAspect.class );

	@Pointcut( "execution(public com.midea.jr.commons.beans.ResponseData com.midea.jr.ecf.channel..*Controller.*(..))" )
	public void controller() {}

	/**
	 * 处理整个control层异常
	 */
	@Around( "controller()" )
	public ResponseData aroundCtrl( ProceedingJoinPoint joinPoint ) throws Throwable {
		ResponseData responseData = new ResponseData();
		try {
			MethodSignature signature = ( MethodSignature )joinPoint.getSignature();
			Method method = signature.getMethod();
			ParamLog logAnnotation = method.getAnnotation( ParamLog.class );
			if( logAnnotation != null ) {
				StringBuilder sb = new StringBuilder();
				String className = signature.getDeclaringType().getName();
				String methodName = signature.getName();
				sb.append( logAnnotation.value() );
				sb.append( "--" );
				sb.append( className );
				sb.append( "." );
				sb.append( methodName );
				sb.append( "--参数：" );
				Object[] args = joinPoint.getArgs();
				for( int i = 0; i < args.length; i++ ) {
					Object o = args[ i ];
					if( o instanceof Number || o instanceof String ) {
						sb.append( "<" );
						sb.append( o.toString() );
						sb.append( ">" );
					} else if( o instanceof ServletRequest || o instanceof ServletResponse ) {
						continue;
					} else {
						sb.append( "<" );
						sb.append( JsonUtils.toJson( o ) );
						sb.append( ">" );
					}
				}
				loger.info( sb.toString() );
			}
			return ( ResponseData )joinPoint.proceed();
		} catch( ServiceException e ) {
			responseData.setMessage( e.getMessage() );
			responseData.setIsSuccess( false );
			responseData.setErrorCode( e.getCode() );
			loger.error( e.getMessage(), e );
			return responseData;
		} catch( Exception e ) {
			responseData.setMessage( "网络繁忙" );
			responseData.setIsSuccess( false );
			responseData.setErrorCode( 500 );
			loger.error( "代码出错", e );
			return responseData;
		}
	}
}