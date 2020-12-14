public class LoopTest1{
	public static void main (String[] args ){
		String msg1 = "hello";
		String msg2 = "Aloha";
		for ( int i = 0; i<100; i++){
			if( i%3==0){
				System.out.println(msg2);
			} else {
				System.out.println (msg1);
			}
		}
	}
}