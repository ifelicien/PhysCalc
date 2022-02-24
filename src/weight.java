public class weight {
    public static void weight_Calc(double massKg){
        double gravity = 9.8;

        double massG = massKg / 1000;
        double weight = massG * gravity;

        System.out.println("mass in grams: " + massG);
        System.out.println("total weight: " + weight);
        System.out.println("Square root of Ts: " + Math.sqrt(weight));
    }
}
