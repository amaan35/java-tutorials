class super2
{
    int x = 10;
    super2()
    {
        System.out.println("2nd class constructor");
    }
    void show()
    {
        System.out.println("in parent class");
    }
}
public class main_super extends super2
{
    int x = 20;
    main_super()
    {
        super();
        System.out.println("main class constructor");
    }
    void show()
    {
        System.out.println("in child class");
    }
    void print()
    {
        System.out.println(x);
        System.out.println(super.x);
        show();
        super.show();
    }
    public static void main(String[] args) {
        main_super obj = new main_super();  //this is where constructor is being called
        obj.print();
    }
}
