public class percentError {
    public static void pError(double vA, double vE) {
        double percentErr = (vA - vE) / vA * 100;

        System.out.println("percent error : " + Math.abs(percentErr));
    }
}