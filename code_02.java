import java.util.Scanner;

public class GasStationSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入工作時數：");
        int hoursWorked = scanner.nextInt();

        double hourlyRate = 98.0; // 每小時的基本工資
        double totalSalary;

        if (hoursWorked <= 60) {
            totalSalary = hoursWorked * hourlyRate;
        } else if (hoursWorked <= 80) {
            totalSalary = 60 * hourlyRate + (hoursWorked - 60) * hourlyRate * 1.2;
        } else {
            totalSalary = 60 * hourlyRate + 20 * hourlyRate * 1.2 + (hoursWorked - 80) * hourlyRate * 1.5;
        }

        System.out.println("工讀金為：" + totalSalary + " 元");
    }
}
