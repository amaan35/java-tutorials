public class while_loop
{
    public static void main(String[] args)
    {
        int a=1;
        aa:
            while(a<=10)
            {
                if(a==6)
                    break aa;
                System.out.println("a : "+a);
                a++;
            }
    }
}
