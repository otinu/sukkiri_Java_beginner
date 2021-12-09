// https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step1

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArray = line.split(" ");
        if (Integer.parseInt(lineArray[0]) * Integer.parseInt(lineArray[1]) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}