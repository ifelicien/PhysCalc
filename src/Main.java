import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("1. Average\n0. Exit");

        int mySelection = myObj.nextInt();

        switch (mySelection){
            case 1:

                System.out.println("Average Calculator\n\n");
                System.out.println("enter 3 numbers to average");

                double x, y, z = myObj.nextDouble();

                break;
            case 2:
                System.out.println("Restart the program and select an option");
                break;
        }
    }
}