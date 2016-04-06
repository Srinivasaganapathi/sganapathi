import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String val = s.next();
		for(int i=val.length()-1;i>=0;i--)
		System.out.print(val.charAt(i));
		s.close();
		
		

	}

}
