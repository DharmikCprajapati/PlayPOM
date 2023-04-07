package tests;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	int a=10;
//	int b=20;
//	
//	if (a==b)	{
//		System.out.println("a and b are equal");
//	}
//	
//	else {
//		System.out.println("a and b are not equal");
//	}
//	
//	String p="Selenium";
//	String q="selenium";
//	
//	if (p.equals(q)) {
//	System.out.println("equal");}
//	
//	else {
//		System.out.println("not equal");
//	}
	
	
//		String str= "Geeks", nstr="";
//        char ch;
//        
//      System.out.print("Original word: ");
//      System.out.println("Geeks"); //Example word
//        
//      for (int i=0; i<str.length(); i++)
//      {
//        ch= str.charAt(i); //extracts each character
//        nstr= ch+nstr; //adds each character in front of the existing string
//      }
//      System.out.println("Reversed word: "+ nstr);
//    
      
     String actual= "AZZIP";
     String reversed= "";
     
     for(int i=0;i<actual.length();i++) {
    	 
    	 reversed = actual.charAt(i) + reversed;
    			 
     }
     System.out.println(reversed);
}
}
