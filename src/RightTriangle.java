public class RightTriangle extends Triangle {

    public RightTriangle(double a, double b, String borderColor, String fillColor) {
        super(a, b, Math.sqrt(a * a + b * b), borderColor, fillColor);
    }

    @Override
    public double calculateArea() {
        return (a * b) / 2;
    }
}