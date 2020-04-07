package com.zz.apollo.test;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

public class MainTest {

	
	//指定运行时的参数 appid  环境  以及meta的地址
	//-Dapp.id=quick-start -Denv=DEV -Ddev_meta=http://localhost:8080
	
	public static void main(String[] args) {
		//获取默认命名空间的配置
		//Config appConfig = ConfigService.getAppConfig();
		//指定命名空间的配置
		Config appConfig = ConfigService.getConfig("TEST1.spring-simple");
		String sms = appConfig.getProperty("sms.enable", "not found");
		String encode = appConfig.getProperty("spring.web.encode", "not found");
		System.out.println(encode);
		System.out.println(sms);
	}
}
