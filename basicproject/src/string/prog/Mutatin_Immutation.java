package string.prog;

public class Mutatin_Immutation {
	public static void main(String[] args) {
		// immutation: no change in initial String value
		String name="indore";
		name.toUpperCase();
		System.out.println(name);
		
		//to male change in string , hold value to other string object
		String name2="indore";
		String name3=name2.toUpperCase();
		System.out.println(name3);
		
	}

}
