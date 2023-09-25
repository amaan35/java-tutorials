public class _finally
{
    public static void main(String[] args) {
        int a = 10;
        try
        {
            int b = a/0;
        }
        catch(ArrayIndexOutOfBoundsException e)                     //catch block not handling exception
        {
            System.out.println("Cant divide by 0");
        }
        finally
        {
            System.out.println("Finally block being executed");     //finally block being executed even after exception not being handled
        }
    }
}
