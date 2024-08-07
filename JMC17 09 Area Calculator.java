public class AreaCalculator {
    
    public static double area(double radius) {
        
        return (radius >= 0) ? (Math.PI * Math.pow(radius, 2)) : -1D;
    }
    
    public static double area(double x, double y) {
        
        return (x >= 0 && y >= 0) ? (x * y) : -1D;
    }
}
