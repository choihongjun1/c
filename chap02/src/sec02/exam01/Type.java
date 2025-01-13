package sec02.exam01;

public class Type {

	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		long var11 = 10;
		long var22 = 20L;
		long var33 = 1000000000000L;
		
		System.out.println(var11);
		System.out.println(var22);
		System.out.println(var33);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		float var111 = 3.14f;
		double var222 = 3.14;
		float var333 = 0.1234567890123456789f;
		double var444 = 0.1234567890123456789;
		
		System.out.println("var111 : " + var111);
		System.out.println("var222 : " + var222);
		System.out.println("var333 : " + var333);
		System.out.println("var444 : " + var444);
		
		double var555 = 3e6;
		float var666 = 3e6F;
		double var777 = 2e-3;
		
		System.out.println("var555 : " + var555);
		System.out.println("var666 : " + var666);
		System.out.println("var777 : " + var777);
		
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
