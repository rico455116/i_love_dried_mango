import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入綜合所得
        System.out.print("請輸入您的綜合所得: ");
        double income = scanner.nextDouble();

        // 計算應納稅額
        double tax = calculateTax(income);
	
	public int tax(int a, int b){ //a是稅率，b是差額
		return (tex * a) - b;
	}

        // 輸出應納稅額
        System.out.println("應納稅額為: " + tax(a, b));
    }

    // 計算應納稅額的方法
    public static double calculateTax(double income) {
        if (income <= 540000) {
            a = 0.05;
	    b = 0;
        }  // 小於540000
	else if (income > 540000 && income <= 1210000){
	    a = 0.12;
	    b = 37800;
        }
	else if(income > 1210000 && income <= 2420000){
	    a = 0.2;
	    b = 134600;
	}
	else if(income > 2420000 && income <= 4530000){
	    a = 0.3;
	    b = 376600;
	}
	else if(income > 4530000){
	    a = 0.4;
	    b = 829600
	}
    }
}
