import java.util.Scanner;
public class ArayTest{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		String password = "123a";
		System.out.print (" input password:");
		
		String userData = sc.nextLine();
		if ( password.equals( userData)){
			System.out.println("OK!");

		}else{
			System.out.println("invalid.");
		}
	}
}