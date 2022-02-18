import java.util.Scanner;

public class avgCalc {
    public static void Average() {
        Scanner myObj = new Scanner(System.in);
        int run = 0;
        int x ,y ,z;

        do {
            double result = 0;

            System.out.println("Enter your 3 totals");

            result = (x + y + z) / 3;
            System.out.println(result);

            System.out.println("Do you want to run the program again? ");
            run = myObj.nextInt();
        }
        while (run != 0);
        if (run == 0) {
            System.out.println("Thank you, please start the program again to calculate AVG!");
        }
    }
}