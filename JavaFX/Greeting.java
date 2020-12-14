import java.util.Scanner;
public class Greeting{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print( " your name >");
	String msg = sc.nextLine();
	System.out.println("ALOHA! Yoshino!" + msg);
}
}