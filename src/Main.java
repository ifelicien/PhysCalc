import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        avgCalc myAvgCalc = new avgCalc();
        percentError pER = new percentError();
        weight findWeight = new weight();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("1. Average\n2. Percent Error\n3. Weight Calculate\n 0. Exit");

        int mySelection = myObj.nextInt();

        switch (mySelection){
            case 1: {

                System.out.println("Average Calculator\n\n");
                System.out.println("enter 3 numbers to average");
                double x = myObj.nextDouble();
                double y = myObj.nextDouble();
                double z = myObj.nextDouble();
                double result = (x + y + z);

                avgCalc.Average(result);
                break;
            }

            case 2:{
                System.out.println("please enter your Actual Value");
                double vA = myObj.nextDouble();

                System.out.println("please enter your Expected Value");
                double vE = myObj.nextDouble();

                pER.pError(vA, vE);
                break;
            }
            case 3:{
                System.out.println("please enter your mass in kilograms ");
                double mass = myObj.nextDouble();

                findWeight.weight_Calc(mass);
            }

            case 0: {
                System.out.println("Restart the program and select an option");
                break;
            }
        }
    }
}