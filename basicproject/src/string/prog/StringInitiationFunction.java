package string.prog;

public class StringInitiationFunction {
	public static void main(String[] args) {
		String s1="i am aksh";   //literal memory ,for similar object value single object allocation in memory
		String s2= new String("i live in deori");   // every object new memory allocate even when object value is same
		
		System.out.println(s1 +" "+ s2);
		
		
		//String_function
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.replace('i', 't'));
		System.out.println(s2.substring(3));
		System.out.println(s2.startsWith("i"));
		System.out.println(s2.endsWith("yy"));
		
		
		
		
		
	}

}
