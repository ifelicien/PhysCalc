import java.lang.Math;

public class percentError {
    public static void pError(double vA, double vE) {
        double percentErr = (vA - vE) / vE * 100;

        System.out.println("percent error : " + Math.abs(percentErr));
    }
}