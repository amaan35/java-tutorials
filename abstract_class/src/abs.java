abstract class Shape
{
    int a, b;
    abstract public void area();
}
class rec extends Shape
{
    @Override
    public void area() {
        System.out.println("Area of rectangle : "+a*b);
    }
}
class sq extends Shape
{
    @Override
    public void area() {
        System.out.println("Area of Square : "+a*a);
    }
}
public class abs {
    public static void main(String[] args) {
        rec r1 = new rec();
        r1.a=5;
        r1.b=5;
        r1.area();
        sq s1 = new sq();
        s1.a=3;
        s1.area();
    }
}
