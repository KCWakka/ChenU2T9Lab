public class RightTriangle {
    private double base;
    private double height;
    public RightTriangle(double newBase, double newHeight) {
        base = newBase;
        height = newHeight;
    }
    public double hypotenuse() {
        return Math.sqrt( (Math.pow(base,2) + Math.pow(height,2)) );
    }
}
