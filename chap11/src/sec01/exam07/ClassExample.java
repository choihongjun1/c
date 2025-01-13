package sec01.exam07;

public class ClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		//Class clazz = Class.forName("sec1.exam7.Car");
		//Car car = new Car();
		//Class clazz - car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
