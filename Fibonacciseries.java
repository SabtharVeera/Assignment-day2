package Assignments2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int t;
		for (int i=0; i<8; i++) 
		{
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
		}
        
	}

}
