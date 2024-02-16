// ScientificCalculator.java
public class ScientificCalculator {
    
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }
    
    public static int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);
    }
    
    public static double naturalLog(double x) {
        return Math.log(x);
    }
    
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
}
