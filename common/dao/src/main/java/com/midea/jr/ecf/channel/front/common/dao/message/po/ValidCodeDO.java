package com.midea.jr.ecf.channel.front.common.dao.message.po;

import java.util.Date;

/**
 * 短信验证码 jr_portal_dev.valid_code
 * @author liwy
 *
 * time:2016年8月24日下午7:02:37
 */
public class ValidCodeDO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2862840428892258714L;
	//验证码id
	private int id;
	//发送手机号
	private String sendto;
	//短信码
	private String code;
	//过期日期
	private Date expire;
	//生成日期
	private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSendto() {
		return sendto;
	}
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

}
