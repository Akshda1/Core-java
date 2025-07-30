package ifffelsee;

public class SchoolGrade {
	public static void main(String[] args) {
		int marks=96;
		if(marks>=90) {
			System.out.println("passed with grade A:"+marks);
		}else if(marks>=75) {
			System.out.println("passed with grade B:"+marks);
		}else if(marks>=60) {
			System.out.println("passed with grade C:"+marks);
		}else {
			System.out.println("passed with grded D:"+marks);
		}
	}

}
