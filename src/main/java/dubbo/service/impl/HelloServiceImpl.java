package dubbo.service.impl;

import dubbo.service.serv.Helloservice;

public class HelloServiceImpl implements Helloservice{

	public String sayHello(String name) {
		
		return "你好："+name;
		
	}

}
