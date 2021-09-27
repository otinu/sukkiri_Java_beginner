package sukkiri_Java_beginner;

class VariousForSample {

	public static void main(String[] args) {

		// 増分値を未指定
		for(int i = 0; i < 2;) {
			System.out.println("インクリメントがないと無限ループになります");
			i++;
		}

		// 初期値を未指定
		int i = 10;
		for(; i > 8; i--) {
			System.out.println("Hello" + i);
		}

	}

}
