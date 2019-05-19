package hxy.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainApp {
 
	public static void main(String[] args) {
 
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		System.out.println(obj);
	}
 
}
/*
环境配置参考:
https://blog.csdn.net/csdnsjg/article/details/80152815

--------------------- 
作者：英雄策马走天涯 
来源：CSDN 
原文：https://blog.csdn.net/qq_36360784/article/details/81103244 
版权声明：本文为博主原创文章，转载请附上博文链接！
*/