
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AphaOrNot {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(in);
		String val =br.readLine().toString();
		int c1 = (int) val.charAt(0),flag=0;
		if(c1>64)
		if(c1<91){		                                                       //||(96>c1||c1<123))
		System.out.println("Alphabet");
		flag=1;
		}
		if(c1>96)
		if(c1<123)
		{
		System.out.println("Alphabet");
		flag=1;
		}
		if(flag==0)
	    System.out.println("Not a Alphabet");
	}

}
