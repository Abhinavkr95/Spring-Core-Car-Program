package in.ait.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ait.beans.Car;
//Test class to test the dependency and target flow 
public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// use to start IOC container
		@SuppressWarnings("unused")
		ApplicationContext context 
				= new ClassPathXmlApplicationContext("spring-beans.xml");
		System.out.println("=============================================\n ");
		//Calling bean
		Car carDiesel = (Car) context.getBean("carDiesel");
		Car carPetrol = (Car) context.getBean("carPetrol");

		carDiesel.drive();
		carPetrol.drive();
	}

}
