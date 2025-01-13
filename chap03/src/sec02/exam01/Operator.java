package sec02.exam01;

public class Operator {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		int result3 = -b;
		System.out.println("result3 = " + result3);
		
		x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		int v1 = 5;
		int v2 = 2;
		
		int result4 = v1 + v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 - v2;
		System.out.println("result5 = " + result5);
		
		int result6 = v1 * v2;
		System.out.println("result6 = " + result6);
		
		int result7 = v1 / v2;
		System.out.println("result7 = " + result7);
		
		int result8 = v1 % v2;
		System.out.println("result8 = " + result8);
		
		double result9 = (double) v1 / v2;
		System.out.println("result9 = " + result9);
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		int num1 = 10;
		int num2 = 10;
		boolean res1 = (num1 == num2);
		boolean res2 = (num1 != num2);
		boolean res3 = (num1 <= num2);
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean res4 = (char1 < char2);
		System.out.println("res4 = " + res4);
	
		int v3 = 1;
		double v4 = 1.0;
		System.out.println(v3 == v4);
		
		double v5 = 0.1;
		float v6 = 0.1f;
		System.out.println(v5 == v6);
		System.out.println((float) v5 == v6);
		
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		
		if (!(charCode < 48) & !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		result -= 5;
		System.out.println("result = " + result);
		result *= 3;
		System.out.println("result = " + result);
		result /= 5;
		System.out.println("result = " + result);
		result %= 3;
		System.out.println("result = " + result);
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
	}

}
