package array;

public class NoteCalculation {
	public static void main(String[] args) {
		int money=6527;
		int note[]= {1000,500,20,5,2};
		int count=0;
		for(int notes:note) {
			count=money/notes;
			System.out.println(notes+"total note is:"+count);
			money=money%notes;	
		}
	}

}
