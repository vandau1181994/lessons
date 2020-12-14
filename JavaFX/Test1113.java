 class Student{
 	private String name;
 	private String favorite;
 			public void sayHello(){
			System.out.println("Hello! My name is " + this.name);

		}
		public void setName(String data){
			this.name = data;
		}

		
		 public void setFavorite(String suki){
		 	this.favorite = suki;
		 	
		 
		
		 }
		 		public void sayFavorite(){
			System.out.println("i love" + " " + this.favorite);

}
 }
 public class Test1113{
 public static void main(String[] args) {

	
		System.out.println("Hello");
		Student yamada = new Student();
	//	yamada.name = "Yamada taro";
		yamada.setName("Yamada Taro");
		yamada.setFavorite( "banhmi");
		yamada.sayHello();
        yamada.sayFavorite();

		//System.out.println( yamada.name);
		Student tanaka = new Student();
		//tanaka.name ="Tanaka Masahiko";
		tanaka.setName(" Tanaka Masahiko");
		tanaka.setFavorite(" Gongcha");
		//System.out.println( tanaka.name);
		
		tanaka.sayHello();
		
		tanaka.sayFavorite();
	}
}
