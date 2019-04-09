package com.midea.jr.ecf.channel.front.common.dao.message.dao;

import com.midea.jr.ecf.channel.front.common.dao.message.po.ValidCodeDO;

/**
 * 
 * 
 * @author  李武元
 * @version ECF-FRONT v1.0 
 * @since   ECF-FRONT v1.0
 */
public interface ValidCodeDao {

	/**
	 * 添加验证码
	 * 〈功能详细描述〉
	 * @param vcDo
	 * @return
	 */
	public Integer addValidCode( ValidCodeDO vcDo );

}
