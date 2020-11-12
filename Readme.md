전에는 Visual 한 컴포넌트를 Bean이라고 불렀지만, 

Bean클래스의 3가지 특징은 다음과 같음

- 기본생성자를 가지고 있습니다.
- 필드는 private하게 선언합니다.
- getter, setter 메소드를 가집니다.
- getName() setName() 메소드를 name 프로퍼티(property)라고 합니다. (용어 중요)



ApplicationContext를 통해 DI 이해를 한다.

> Context를 통해 설정파일을 읽어서 bean 객체에 인스턴스  주입
>
> Context로부터 읽은 객체는 Singleton pattern으로 생성된 인스턴스



