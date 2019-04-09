package com.midea.jr.ecf.channel.front.common.common.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.METHOD } )
public @interface ParamLog {

String value();
}
