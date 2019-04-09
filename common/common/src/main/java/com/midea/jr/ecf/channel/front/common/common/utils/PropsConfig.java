package com.midea.jr.ecf.channel.front.common.common.utils;

import com.midea.config.store.MconfigCenterStore;

/**
 * 读取配置文件工具类
 * @author liwy
 *
 * time:2016年8月23日下午5:37:38
 */
public class PropsConfig {
    
	public  static String getPropValue(String key) {
	    String keys = (String)MconfigCenterStore.getInstance().getData(key);
		return keys;
	}
	
	public static int getPropValue(String key,int defaultV) {
		return getPropValue(key)!=null?Integer.parseInt(getPropValue(key)):defaultV;
	}
	
	public static String getPropValue(String key,String defaultV) {
		return getPropValue(key)!=null?getPropValue(key):defaultV;
	}
	
	
}
