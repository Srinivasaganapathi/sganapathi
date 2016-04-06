import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner (System.in);
		String c =s.next();
		int flag=0;
		switch(c)
		{
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
		flag=1;
		}
			if(flag==1)
		System.out.println("Vowel");
	        else
	    System.out.println("Consonant");
		
		s.close();
	}

}
