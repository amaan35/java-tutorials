public class instance_initializer
{
    int a, b;
    instance_initializer()
    {
        a=10;
        b=20;
        show();
    }

    {
        a = 5;
        b = 10;
        show();
    }   //this is the instance initializer block and it will be executed before constructor as soon as the object is created
    void show()
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        instance_initializer obj = new instance_initializer();
    }
}
