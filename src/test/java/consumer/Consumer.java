package consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubbo.service.serv.Helloservice;

public class Consumer {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("client.xml");
		Helloservice servie=(Helloservice) ac.getBean("userService");
		String result=servie.sayHello("chenl");
		
		System.out.println(result);
		while (true) {
			
		}
	}
}
