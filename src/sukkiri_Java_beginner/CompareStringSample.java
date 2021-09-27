package sukkiri_Java_beginner;

public class CompareStringSample {

	public static void main(String[] args) {
		String fish = new String("tinu");
		String ask = "OK?";

		//本来、String型にはequalsメソッドを使うのがセオリーとのこと

		if(ask.equals("OK?")) {
			System.out.println(fish);
		}

		/*
		 * しかし、下記のような記述でもエラー発生は見受けられなかった
		if(ask == "OK?") {
			System.out.println(fish);
		}
		*/

	}

}
