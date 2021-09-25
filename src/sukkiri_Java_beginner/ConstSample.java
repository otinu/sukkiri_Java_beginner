package sukkiri_Java_beginner;

public class ConstSample {

	public static void main(String[] args) {
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);

		/*
		// Eclipseが定数への代入をできない旨警告してくれる
		PI = 3;
		*/

	}

}
