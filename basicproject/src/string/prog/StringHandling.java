package string.prog;

public class StringHandling {
	public static void main(String[] args) {
		String s1="i am aksh";   //literal memory:for similar object value single object allocation in memory
		String s2= new String("i live in deori");   // heap memory:every object new memory allocate even when object value is same
		
		System.out.println(s1 +" "+ s2);
		
	}

}
