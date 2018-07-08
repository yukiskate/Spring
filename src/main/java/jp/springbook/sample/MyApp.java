package jp.springbook.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean = (MyBean) context.getBean("mybean");
		bean.hello();
	}

}
