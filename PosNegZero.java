import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner (System.in);
		int val;
		val=s.nextInt();
		if(val>0)
			System.out.println("Positive");
		else if(val<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		s.close();		
		
	}

}
