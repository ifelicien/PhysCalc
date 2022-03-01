public class weight {
    public static void weight_Calc(double massKg, double loopNum){
        double gravity = 9.8;
        double length = 216;

        double lambda = 2* (length / loopNum);
        double massG = massKg / 1000;
        double weight = massG * gravity;

        System.out.println("mass in grams: " + massG);
        System.out.println("total weight: " + weight);
        System.out.println("Square root of Ts: " + Math.sqrt(weight));
        System.out.println("lambda is " + lambda + "cm");
        System.out.println("lambda is " + lambda/100 + "m");
    }
}
