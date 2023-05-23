import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        int amountSpentMoney;
        int discount;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter amount spent money amount:");
        amountSpentMoney = in.nextInt();

        System.out.println("Enter discount percentage:");
        discount = in.nextInt();

        int afterDiscount = amountSpentMoney - (amountSpentMoney* discount / 100);

        System.out.println("After discount your bill is: " + afterDiscount);

    }

}
