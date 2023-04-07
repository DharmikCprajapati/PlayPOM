package tests;

public class Test1 {

//Class Name, Object Name= New, class name()	

	static Test1 t1 = new Test1();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I'm In Manin Mathod");
		printme();
		System.out.println("After PrintMe");
		scanme();
		t1.testme();
		t1.paintme();
		
		
		
	}

	public static void printme() {
		
		System.out.println("printme");
		t1.paintme();
		
	}
	
	public static void scanme() {
		
		System.out.println("scane me");
		
	}
	
	public  void testme() {
		
		System.out.println("testme");
	}
	
	public void paintme() {
		
		System.out.println("paint me");
	}
}
