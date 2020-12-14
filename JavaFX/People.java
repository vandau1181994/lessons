  public class People {
    public static void main ( String[] args ) {
      Teacher tanaka = new Teacher("田中","元気ですか？");
      Teacher yamamoto = new Teacher("山本","出席たりてますか？");
      Teacher yoshino = new Teacher("吉野","ALOHA");
      
      tanaka.hello();
      yamamoto.hello();
      yoshino.hello();
    }
  }
  
  class Teacher {
    String msg = "";
    String name = "";

    Teacher(String kotoba, String names){
      msg = kotoba;
      name = names;
      
    }
    
    public void hello() {
      System.out.println( msg + name );
    }
  }