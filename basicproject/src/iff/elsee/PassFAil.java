package iff.elsee;

public class PassFAil {
	public static void main(String args[]) {
		int totalm=100;
		int passm=33;
		int studentno=4;
		if(studentno>passm) {
			System.out.println("pass");
		}else if(studentno==passm) {
				System.out.println("boundary pass");
			}else {
				System.out.println("failed");
			}
		}
	}


