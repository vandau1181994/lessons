 import java.util.Scanner;
  
  public class ScopeTest {
   static Scanner sc = new Scanner( System.in );
    
    public static void main( String[] args ) {
      System.out.print( "what your name ? : >" );
      String name = sc.nextLine();
      System.out.println( name );
      
      methodA();
    }  
    
    public static void methodA() {
      System.out.print( "how old are you ? >" );
      String name = sc.nextLine();
      System.out.println( name );
    }
  }