public class multiple_catch
{
    public static void main(String[] args) {
        /* multiple catch statements are used when a code can generate more than one type of exceptions, so the
        corresponding catch statement gets executed, order of catch statements should be from more specific
         to general exception */
        int[] array = new int[]{1,2,3,4,5};
        try{
            System.out.println(array[0]);
            System.out.println(array[10]);                  //exception occurs here
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)             //this catch statement will be selected
        {
            System.out.println("Array limit reached");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Code below multiple catch statements");

        /*
        * If you want to handle multiple different types of exceptions with same code
        * then you can also write catch blocks in one block like this :
        * catch(ArithmeticException | ArrayIndexOutOfBoundsException | Exception e){
        *   //the code that will be executed
        * }
        * */
    }
}
