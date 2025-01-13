package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		/*
		메소드 호출 불가
		parent.method3();
		*/

	}

}
