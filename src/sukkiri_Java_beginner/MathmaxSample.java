package sukkiri_Java_beginner;

public class MathmaxSample {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println(m); //二つの値を比較し、大きい方を評価する

		a -= 2;
		b += 10;
		m = Math.max(a, b);
		System.out.println(m);
	}

}
