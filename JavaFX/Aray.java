import java.util.Scanner;
   
   public class Aray {
     public static void main ( String[] args ) {
       Scanner sc = new Scanner( System.in );		
       String[] names = String[3];			
       
      
       for ( int i=0; i<3; i++ ) {
         System.out.print( "input name: " );
         names[i] = sc.nextLine();
       }
       
       for ( int i=0; i<3; i++ ) {
         System.out.println( names[i] );
       }
       
     }
   }