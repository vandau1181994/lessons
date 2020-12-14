public class WarmUp1{
	public static void main(String[] args){
		String data = getData();
		showData(data);
	}
	public static String getData(){
		System.out.println("getData()!");
		return "ALOHA";
	
	}
	public static void showData( String name ){
		System.out.println("showData()!");

		System.out.println( name );

	}
}