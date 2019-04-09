package com.midea.jr.ecf.channel.front.common.impl.message;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.midea.jr.ecf.channel.front.common.common.constant.EcfConstants;
import com.midea.jr.ecf.channel.front.common.common.exception.ServiceException;
import com.midea.jr.ecf.channel.front.common.common.utils.GsonUtils;
import com.midea.jr.ecf.channel.front.common.common.utils.PropsConfig;
import com.midea.jr.ecf.channel.front.common.dao.message.dao.ValidCodeDao;
import com.midea.jr.ecf.channel.front.common.service.message.MessageService;
import com.midea.jr.framework.message.constants.CommonConstants;
import com.midea.jr.framework.message.params.MsgScheduleParam;
import com.midea.jr.framework.message.utils.MessageUtil;

/**
 * @author csy
 * @description
 * @date 2018-4-19
 */
@Service( "messageService" )
public class MessageServiceImpl implements MessageService {

	private static final Logger LOGGER = LoggerFactory.getLogger( MessageServiceImpl.class );

	@Resource
	private ValidCodeDao validDao;

	@Override
	public String sendMessage( MsgScheduleParam param, Long msgTemplateId, Map<String, String> paramMap, String loginName ) {
		LOGGER.info( "发送短信息 公共方法 ====>     " + GsonUtils.toJson( paramMap ) );
		try {
			// 获取模板信息
			String templateMsg = MessageUtil.transMessage( msgTemplateId, paramMap );
			LOGGER.info( "短信内容 ====>" + templateMsg );
			param.setSystem( Integer.parseInt( PropsConfig.getPropValue( "system" ) ) );
			param.setSubSys( Integer.parseInt( PropsConfig.getPropValue( "subSys" ) ) );
			param.setModule( Integer.parseInt( PropsConfig.getPropValue( "module" ) ) );
			param.setSendType( CommonConstants.SEND_TYPE_SMS );
			param.setSendContent( templateMsg );
			param.setReceiveBy( loginName );
			LOGGER.info( "发送短信息 参数 ====>  param   " + GsonUtils.toJson( param ) );
			// 发送模板信息
			String returnCode = MessageUtil.sendMessage( param );
			LOGGER.info( "发送短信息 状态码 ====>  returnCode   " + returnCode );
			if( EcfConstants.MSG_CODE_SUCCESS.equals( returnCode ) ) {
				return returnCode;
			} else {
				LOGGER.info( "发送短信息有误，请检查，错误码：" + returnCode );
			}

		} catch( Exception e ) {
			new ServiceException( "发送短信息异常" + e );
		}
		return EcfConstants.MSG_CODE_ERROR;

	}

	@Override
	public String sendValidateMessage( MsgScheduleParam param, Long msgTemplateId, Map<String, String> paramMap, String loginName ) {

		LOGGER.info( "发送 验证 短信息 公共方法 ====>     " + GsonUtils.toJson( paramMap ) );
		try {
			// 获取模板信息
			String templateMsg = MessageUtil.transMessage( msgTemplateId, paramMap );
			LOGGER.info( "短信内容 ====>" + templateMsg );
			param.setSystem( Integer.parseInt( PropsConfig.getPropValue( "system" ) ) );
			param.setSubSys( Integer.parseInt( PropsConfig.getPropValue( "subSys" ) ) );
			param.setModule( Integer.parseInt( PropsConfig.getPropValue( "module" ) ) );
			param.setSendType( CommonConstants.SEND_TYPE_SMS );
			param.setSendContent( templateMsg );
			param.setReceiveBy( loginName );
			LOGGER.info( "发送短信息 参数 ====>  param   " + GsonUtils.toJson( param ) );
			// 发送模板信息
			String returnCode = MessageUtil.sendVeriCode( param, paramMap.get( "S1" ) );

			LOGGER.info( "发送短信息 状态码 ====>  returnCode   " + returnCode );
			if( EcfConstants.MSG_CODE_SUCCESS.equals( returnCode ) ) {

				LOGGER.info( "发送短信息 状态码 ====>  returnCode   " + returnCode );
				return returnCode;
			} else {
				LOGGER.info( "发送短信息有误，请检查，错误码：" + returnCode );
			}

		} catch( Exception e ) {
			new ServiceException( "发送 验证 短信息异常" + e );
		}
		return EcfConstants.MSG_CODE_ERROR;
	}

	@Override
	public Boolean validateMessage( String phoneNum, String veriCode ) {

		LOGGER.info( "验证 短信 公共方法 " );
		boolean flag = false;
		try {
			// 发送模板信息
			flag = MessageUtil.validVeriCode( phoneNum, veriCode );

		} catch( Exception e ) {
			new ServiceException( "发送 验证 短信息异常" + e );
		}
		return flag;
	}

}
