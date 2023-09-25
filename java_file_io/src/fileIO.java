import java.io.*;

public class fileIO {
    public static void main(String[] args) {
        String[] names = {"Syed", "Amaan", "Ali"};

        //writing to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to this file");
            for (String name : names) {
                writer.write("\n"+name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
