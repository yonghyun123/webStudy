전에는 Visual 한 컴포넌트를 Bean이라고 불렀지만, 

Bean클래스의 3가지 특징은 다음과 같음

- 기본생성자를 가지고 있습니다.
- 필드는 private하게 선언합니다.
- getter, setter 메소드를 가집니다.
- getName() setName() 메소드를 name 프로퍼티(property)라고 합니다. (용어 중요)



# IoC 이해



ApplicationContext를 통해 IoC 이해를 한다.

> Context를 통해 설정파일을 읽어서 bean 객체에 인스턴스  주입
>
> Context로부터 읽은 객체는 Singleton pattern으로 생성된 인스턴스



# DI 이해

```xml
	<bean id="car" class="kr.or.connect.diexam01.Car">
		<property name="engine" ref="e"></property>
	</bean>
```

Car 클래스 인스턴스 변수 engine에 Engine 객체를 주입하면서 main에서 변수를 생성할 필요없이 car의 메서드 실행 가능

```java
Main
		Car car = (Car)ac.getBean("car");
		car.run();
```

# Annotaion

@ComponentScan, @Component

Java 설정파일을 만든후 

ComponentScan 어노테이션을 이용해 Component객체 찾기(bean 객체)

bean 클래스 Component 어노테이션을 넣고 의존성 주입이 가능한 객체상태로 만듦





# Spring MVC 흐름도



![스크린샷 2020-11-15 오후 4.43.50](/Users/yonghyun/Desktop/studyWeb/스크린샷 2020-11-15 오후 4.43.50.png)



