package sec04.exam02;

public class KeyCode {

	public static void main(String[] args) throws Exception {
		int KeyCode;
		
		while (true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode : " + KeyCode);
			if (KeyCode == 113) {
				break;
			}
		}

	}

}
