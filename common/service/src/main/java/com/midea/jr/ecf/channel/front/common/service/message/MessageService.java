package com.midea.jr.ecf.channel.front.common.service.message;

/**
 * @author csy
 * @description 短信类
 * @date 2018-4-26
 */

import java.util.Map;

import com.midea.jr.framework.message.params.MsgScheduleParam;

public interface MessageService {

	/**
	 * 发送验证短信
	 * @param param
	 * @param msgTemplateId
	 * @param paramMap
	 * @param loginName
	 * @return
	 */
	public String sendMessage( MsgScheduleParam param, Long msgTemplateId, Map<String, String> paramMap, String loginName );

	/**
	 * 发送通知短信
	 * @param param
	 * @param msgTemplateId
	 * @param paramMap
	 * @param loginName
	 * @return
	 */
	public String sendValidateMessage( MsgScheduleParam param, Long msgTemplateId, Map<String, String> paramMap, String loginName );

	/**
	 * 验证短信
	 * @param phoneNum
	 * @param veriCode
	 * @return
	 */
	public Boolean validateMessage( String phoneNum, String veriCode );
}