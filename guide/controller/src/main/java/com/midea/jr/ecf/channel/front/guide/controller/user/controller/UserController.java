package com.midea.jr.ecf.channel.front.guide.controller.user.controller;

import com.midea.jr.ecf.channel.front.common.common.aspect.ParamLog;
import com.midea.jr.ecf.channel.front.common.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author csy
 * @description 导购用户信息controller
 * @date 2018-4-19
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private MessageService messageService;

	@RequestMapping( "updateBankCardSendMsg" )
	@ParamLog("导购修改银行卡号发送短信验证码")
	public ResponseData<String> updateBankCardSendMsg() {
//		messageService.sendMessage()
//		return testService.test();
		return null;
	}

}
