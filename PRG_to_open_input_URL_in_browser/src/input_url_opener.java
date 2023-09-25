import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.util.Scanner;
public class input_url_opener
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str;
        System.out.println("Enter the URL you want to search : ");
        str = cin.next();
        URI u = URI.create(str);
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
