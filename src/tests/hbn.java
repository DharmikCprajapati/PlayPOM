package tests;

public class hbn {
	public static void main(String[] args) {

	
//	public static class StringFormatter {  
//		public static String reverseString(String str){  
//		    StringBuilder sb=new StringBuilder(str);  
//		    sb.reverse();  
//		    return sb.toString();  
//		}  
//		}  
//
//		public static class TestStringFormatter {  
//		public static void main(String[] args) {  
//		    System.out.println(StringFormatter.reverseString("my name is khan"));  
//		    System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));      
//		    }  
//		}  

	String[] names = { "java",	"ruby", "python",	"jvm",	"java"} ;
	
	for(int i=0; i<names.length;i++) {
		for(int j=i+1; j<names.length;j++) {
			if(names[1].equals(names[j])) {
				System.out.println(i);
			}
		}
		
	}


}
}