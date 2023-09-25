public class nested_try
{
    public static void main(String[] args) {
        try
        {
            int a = 1;
            int b = 0;
            int c = a/b;
            try
            {
                int[] arr = {1,2,3,4,5};
                System.out.println(arr[8]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array limit reached");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Code below outer catch block");
    }
}
