package 기타;

public class FigureMain {

    public static void main(String[] args) {
        Circle circle = new Circle(2.4);
        Rectangle rec = new Rectangle(1.0, 3.0);

        System.out.println(circle.getArea());
        System.out.println(rec.getArea());

    }
}
