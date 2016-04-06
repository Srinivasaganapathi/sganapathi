import java.util.Scanner;

public class IntReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int val=s.nextInt(),temp;
		while(val>0)
		{
			temp=val%10;
			val/=10;
			System.out.print(temp);		
		}
        s.close();
	}

}
