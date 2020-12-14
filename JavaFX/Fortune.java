import java.util.Random;
public class Fortune{
	public static void main ( String[]args){
		String[] fortune = { " lucky","usualy","unlucky"};
		Random random = new Random();

		for ( int i=0; i<10;i++){
			int num = random.nextInt(3);
			System.out.println(fortune[num]);
		}

	}
}