import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhấp số tiền gửi ngân hàng: ");
        money = sc.nextDouble();

        System.out.println("Nhập số tháng gửi: ");
        month = sc.nextInt();

        System.out.println("Nhập số lãi xuất: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i<month; i++){
            totalInterest += money * ((interestRate/100)/12) * month;
        }
        System.out.println("Số tiền nhận được sau khi gửi lãi = " + totalInterest);
    }
}
