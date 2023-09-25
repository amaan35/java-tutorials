import java.util.Scanner;
public class switch_start
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int a;
        System.out.println("Enter the gym day number : ");
        a = cin.nextInt();
        switch(a)
        {
            case 1 : System.out.println("Its chest day");
                break;
            case 2 : System.out.println("Its Back day");
                break;
            case 3 : System.out.println("Its Shoulders day");
                break;
            case 4 : System.out.println("Its Tricep day");
                break;
            case 5 : System.out.println("Its Bicep day");
                break;
            case 6 : System.out.println("Its Leg day");
                break;
            default: System.out.println("Invalid number entered");
        }
    }
}
