public class Triangle extends Shape {
    protected double a, b, c;

    public Triangle(double a, double b, double c, String borderColor, String fillColor) {
        super(borderColor, fillColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf("Sides: %f %f %f. Perimeter: %f. Area: %f\n",
                this.a, this.b, this.c, this.calculatePerimeter(), this.calculateArea());
    }
}
