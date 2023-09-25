public class try_catch_tut {
    public static void main(String[] args) {
        int x, y;
        x=100;
        y=0;
        try {                                               //code that might generate exception in the normal flow of the prg
            int z=x/y;
        }
        catch (ArithmeticException e)                       //code to catch that exception
        {
            System.out.println(e);
            System.out.println("Cant divide by 0");
        }
        System.out.println("Code below catch statement");
    }
}
