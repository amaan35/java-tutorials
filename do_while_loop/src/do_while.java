public class do_while
{
    public static void main(String[] args)
    {
        int a=1;
        do
        {
            if(a==6)
                break;
            System.out.println("a : "+a);
            a++;
        }
        while(a<=10);
    }
}
