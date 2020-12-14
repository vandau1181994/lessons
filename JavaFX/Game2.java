import java.util.Scanner;
import java.util.Random;
public class Game2{
	public static void main(String[] args ){
		System.out.println("##################################");
		System.out.println("##0 ------------------------   0##");
		System.out.println("★·.·´¯`·.·★ NINJA ★·.·´¯`·.·★--");
		System.out.println("##  --------------------------  ##");
		System.out.println("##################################");
		System.out.println("");
		System.out.println("1: NARUTO     2: SASUKE");

		System.out.print( "> ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		// neu 1........ neu 2
		if ( userInput == 1 ){
			System.out.println("###################################");
			System.out.println("## ----------------------------- ##");
			System.out.println( "★·.·´¯`·.·★ NARUTO ★·.·´¯`·.·★");
			System.out.println("##  ---------------------------  ##");
			System.out.println("###################################");

		}else{
		System.out.println("################################");
		System.out.println("## -------------------------- ##");
		System.out.println("★·.·´¯`·.·★ SASUKE ★·.·´¯`·.·★");
		System.out.println("## -------------------------- ##");
		System.out.println("################################");
		System.out.println("");

		}

	
}
}