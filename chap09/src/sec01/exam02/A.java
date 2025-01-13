package sec01.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static C field3 = new C();
	
	static void method2() {
		C var1 = new C();
	}
	
	class B {}
	
	static class C {}
}
