
import java.util.Scanner;

public class ThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner (System.in);
		int val1=0,val2=0,val3=0,resu;
		val1=s.nextInt();
		val2=s.nextInt();
		val3=s.nextInt();
		resu= Math.max(val1,Math.max(val2,val3));
		System.out.println(resu);
		s.close();
		
	}

}
