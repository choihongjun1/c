package sec01.exam03;

import java.util.Date;

public class SwitchExample4 {

	public static void main(String[] args) {
		method1(10);
		method1("10");
		method1(null);
		method1(new Date());
	}
	
	public static void method1(Object obj) {
		switch(obj) {
			case Integer i -> System.out.println(i);
			case String s -> System.out.println("\"" + s + "\"");
			case null, default -> System.out.println("unknown");
		}
	}

}
