  public class People1 {
    public static void main ( String[] args ) {
      Teacher tanaka = new Teacher("田中","元気ですか？","10");
      Teacher yamamoto = new Teacher("山本","出席たりてますか？","8");
      Teacher yoshino = new Teacher("吉野","ALOHA","5");
      
      tanaka.hello();
      yamamoto.hello();
      yoshino.hello();
      attack ( tanaka, yoshino);
      attack( yamamoto, tanaka);
      attack( tanaka, yamamoto);
      attack( tanaka, yamamoto);

    }
  
  public void attack ( Teacher a, Teacher b){
    System.out.println(a.name + " のこうげき！");
    System.out.println(b.name + "に５のダメージ!");
    int newHp = b.hp - 5;
    b.hp = newHp;
    if( b.hp <= 0 ){
      System.out.println( b.name +  "をたおした！");
    }
  }
  }
  class Teacher{
    String name = "";
    String msg = "";
    int hp;
    Teacher(String name ,String kotoba,int value){
      name = namae;
      msg = kotoba;
      hp = value;
    }
    public void hello (){
      System.out.println(name + "です。" + msg);
    }
  }
