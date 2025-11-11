public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(12.4, "blue", "red");
        Shape triangle = new Triangle(3, 4, 5, "red", "blue");
        Shape rightTriangle = new RightTriangle(3, 4, "blue", "yellow");

        circle.showMe();
        triangle.showMe();
        rightTriangle.showMe();
    }
}