import com.company.Shape;

public class Rectangle extends Shape {
    private int side;
    public Rectangle(int length,int width){
        super("Rectangle");
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
}
