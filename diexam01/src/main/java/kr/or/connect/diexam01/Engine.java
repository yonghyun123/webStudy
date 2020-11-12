package kr.or.connect.diexam01;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		// TODO Auto-generated constructor stub
		System.out.println("Engine 생성자!!");
	}
	
	public void exec(){
		System.out.println("Engine 동작합니다.!!");
	}

}
