https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step2

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArray = line.split(" ");
        if (Integer.parseInt(lineArray[0]) == 1 || Integer.parseInt(lineArray[1]) == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
