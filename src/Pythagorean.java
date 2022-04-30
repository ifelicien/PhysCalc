import static java.lang.Math.sqrt;

public class Pythagorean {
    public static void pTheorem(double a, double b){
        double aSq, bSq, c;

        aSq = (a * a);
        bSq = (b * b);

        c = Math.sqrt(aSq + bSq);

        System.out.println(c);
    }
}
