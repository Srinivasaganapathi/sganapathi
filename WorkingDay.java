

import java.util.Scanner;

public class WorkingDay {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String val=s.nextLine();
		if(val.equalsIgnoreCase("sunday")||val.equalsIgnoreCase("Saturday"))
			System.out.println("False");
		else
			System.out.println("True");
		s.close();
		

	}

}
