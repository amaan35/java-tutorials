import java.util.Scanner;
class add
{
    public static int addit(int a, int b)
    {
        System.out.println("int based addit");
        return(a+b);
    }
    public static float addit(float a, float b)
    {
        System.out.println("float based addit");
        return(a+b);
    }
}
public class method_overload
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float x, y;
        System.out.println("Enter two numbers to add : ");
        x=cin.nextInt();
        y=cin.nextFloat();
        System.out.println(add.addit(x, y));
    }
}
