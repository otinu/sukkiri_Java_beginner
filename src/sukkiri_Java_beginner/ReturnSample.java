package sukkiri_Java_beginner;

public class ReturnSample {

	public static void main(String[] args) {

		System.out.println("メソッドを呼び出します");
	    String name = hello();

	    System.out.println(name + "　はhelloメソッドの戻り値です");
	  }

	  public static String hello() {
		  String name = "tinu";
		  return name;	//戻り値として変数を返す
	  }
}

