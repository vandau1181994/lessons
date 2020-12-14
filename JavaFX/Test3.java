   import java.util.Random;
   
   public class Test3 {
     public static void main ( String[] args ) {
       
       Random random = new Random();
       
       
       String[] a = { "YOKOHAMA" };
       String[] b = { "SINJUKU" };
       String[] c = { "IKEBUKURO" };
       
       
       String city = "";
       int num = random.nextInt(3);
       city = city + a[ num ];		
       
       num = random.nextInt(3);
       city = city + b[ num ];			
       
       num = random.nextInt(3);
       city = city + c[ num ];			
       
       System.out.println( city );
     }
   }
   