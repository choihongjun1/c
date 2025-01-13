package sec01.exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
		/*
		fianl 특성 -> 변경 불가
		arg = 100;
		localVariable = 100;
		*/
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
