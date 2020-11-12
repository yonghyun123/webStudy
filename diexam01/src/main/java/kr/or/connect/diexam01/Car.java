package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자!!");
	}
	
	public void run(){
		System.out.println("차가 달립니다.");
		v8.exec();
	}
	
//	public static void main(String[] args) {
//		
////		Engine engine = new Engine();
////		Car car = new Car();
////		car.setEngine(engine);
////		car.run();
//		// 위의 역할을 IoC가 되도록 해야함
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
//		Engine e = (Engine)ac.getBean("e");
//		e.exec();
//	}
}
