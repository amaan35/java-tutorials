class method_overriding2
{
    void student()
    {
        System.out.println("student 2");
    }
}
public class method_overriding extends method_overriding2
{
    void student()
    {
        System.out.println("student 1");
    }
    public static void main(String[] args) {
        method_overriding2 obj = new method_overriding2();
        obj.student();
    }
}
