import java.util.Scanner;

public class DecimalToOctalHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個十進位整數：");
        int decimalNumber = scanner.nextInt();

        String octalNumber = Integer.toOctalString(decimalNumber);
        String hexNumber = Integer.toHexString(decimalNumber);

        System.out.println("該整數的八進位表示法為：" + octalNumber);
        System.out.println("該整數的十六進位表示法為：" + hexNumber);
    }
}
