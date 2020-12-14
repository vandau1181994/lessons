import java.util.Scanner;6
public class ArrrayTest{
	public static void main(String[] args ){
		String password = "123a";
		Scanner sc = new Scanner( System.in );
		  while ( true ) {
		  	System.out.print( " input password: ");
		  	String userData = sc.nextLine();

		  	if ( password.equals( userData )){
		  		break;
		  	}
		  }
	}
}