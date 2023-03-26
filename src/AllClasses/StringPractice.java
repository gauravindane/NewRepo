package AllClasses;

public class StringPractice {
	
	public static void main(String[] args) {
		
		String str="This is Java automation class";
//		String words[]=str.split(" ");
//		
//		System.out.println(words.length);
//		
//		for(int i=0; i<=words.length-1; i++) {
//			System.out.print(words[i]);
//		}
		
		String first = str.split(" ")[0].trim();
		String second = str.split(" ")[1].trim();
		
		System.out.println(first);
		System.out.println(second);
		
		
	
	
	}

}
