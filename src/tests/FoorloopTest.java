package tests;

public class FoorloopTest {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=10;i++) {
			System.out.println(i);
			if (i==5) {
				System.out.println("got 5");
				break;
				
			}
			
		}

		System.out.println("After the Loop");
	}

}
