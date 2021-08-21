package ch07;

public class MakeRectangleTest {

    public static <X, Y> double makeRectangle(Point<X, Y> p1, Point<X, Y> p2) {
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double length = bottom - top;

        return length * width;
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = MakeRectangleTest.<Integer, Double>makeRectangle(p1, p2);
        System.out.println("사각형의 넓이는 " + rect + "입니다.");
    }

}
