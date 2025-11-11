public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, String borderColor, String fillColor) {
        super(borderColor, fillColor);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf("Radius: %f. Perimeter: %f. Area: %f\n", this.radius, this.calculateArea(), this.calculatePerimeter());
    }
}
