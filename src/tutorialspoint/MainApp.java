package tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");//todo: file name
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");	//params:bean id;	return: generic object;
		obj.displayInfo();
	}
}
