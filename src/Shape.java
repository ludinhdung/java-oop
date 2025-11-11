public abstract class Shape {
    protected String borderColor;
    protected String fillColor;

    public Shape(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    protected abstract double calculatePerimeter();

    protected abstract double calculateArea();

    public void showMe() {
        System.out.printf("Border color: %s. Fill color: %s. ", this.borderColor, this.fillColor);
    }

}
