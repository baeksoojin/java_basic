package 기타;

public class Rectangle extends Figure{

    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea(){
        return Double.valueOf(String.format("%.3f",this.width*this.height));
    }
}
