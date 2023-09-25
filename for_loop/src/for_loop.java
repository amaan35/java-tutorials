public class for_loop
{
    public static void main(String[] args)
    {
        //simple for loop
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=a; j>=i; j--)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //labelled for loop
        aa:
            for(int m=1; m<=10; m++)
            {
                if(m==6)
                    break aa;
                System.out.println("m : "+m);
            }
            System.out.println("aa broken");
    }
}
