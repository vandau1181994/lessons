   import java.util.Random;
   
   public class Stories {
     public static void main ( String[] args ) {
       
       Random random = new Random();
       
       
       String[] subjects = { "Tanaka", "Yamamoto", "Yoshino" };
       String[] places = { "セブンイレブンで", "飛行機の中で", "相鉄線で" };
       String[] done = { "ラーメンを食べた", "風呂にはいった", "料理した" };
       
       
       String story = "";
       int num = random.nextInt(3);
       story = story + subjects[ num ];		
       
       num = random.nextInt(3);
       story = story + places[ num ];			
       
       num = random.nextInt(3);
       story = story + done[ num ];			
       
       System.out.println( story );
     }
   }
   