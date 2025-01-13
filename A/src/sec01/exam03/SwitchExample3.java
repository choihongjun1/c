package sec01.exam03;

public class SwitchExample3 {

	public static void main(String[] args) {
		method1(null);
		method2(null);
	}
	
	public static void method1(String s) {
		switch(s) {
			case null -> System.out.println("null");
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			default -> System.out.println("unknown");
		}
	}
	
	public static void method2(String s) {
		switch(s) {
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			case null, default -> System.out.println("unknown");
		}
	}
}
