package sukkiri_Java_beginner;

public class SwhitchSample {

	public static void main(String[] args) {
		    int integer = new java.util.Random().nextInt(5) + 1;
		    switch (integer) {
		     case 1:
	    	   System.out.println("1");
		       break;

		     case 2:
		       System.out.println("2");
		       break;

		     case 3:
		       System.out.println("3");
		       break;

		     case 4:
		       System.out.println("4");
		       break;

		     case 5:
		       System.out.println("5");
		    }

		    /*
		     * case文の中に条件式を指定することはできない
		     * そのため、Swhitch文は「変数の値が〇〇のとき」と指で数えきれる程度のシナリオが想定される場合に用いるはず

		    switch (integer) {
		     case (integer * 2 > 6):
	    	   System.out.println("1");
		       break;

		     case integer / 2 > 6:
		       System.out.println("2");
		       break;

		    }
		    */

	}

}
