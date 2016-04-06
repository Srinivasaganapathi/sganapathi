

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int val=s.nextInt(),result=1;
		for(int i=1;i<=val;i++)
		{
			result*=i;
		}
		System.out.println(result);
		
s.close();
	}

}
