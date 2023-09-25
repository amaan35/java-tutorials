public class Continue
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println("i : "+i);
        }
        int j=1;
        while(j<=5)
        {
            if(j==3)
            {
                j++;
                continue;
            }
            System.out.println("j : "+j);
            j++;
        }
    }
}
