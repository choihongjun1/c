package sec03.exam01;

public class Promotion {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);

		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue1 = intValue5 / 4.0;
		System.out.println(doubleValue1);
		
		int xx = 1;
		int yy = 2;
		double res = (double) xx / yy;
		System.out.println(res);
		
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);
		
	}

}
