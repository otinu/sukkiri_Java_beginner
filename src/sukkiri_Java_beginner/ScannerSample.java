package sukkiri_Java_beginner;

public class ScannerSample {

	public static void main(String[] args) {
		System.out.println("好きなお魚は何ですか");
		String fish = new java.util.Scanner(System.in).nextLine();
		System.out.println("何匹釣りましたか");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.println(fish + "を" + num + "匹ですね");
	}

}
