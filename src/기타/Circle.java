package 기타;

public class Circle extends Figure{
    private double r;

    public Circle(double r){
        this.r = r;
    }
    @Override
    double getArea() {
        return Double.valueOf(String.format("%.3f",this.r*this.r*3.14));
    }
}
