//import java.util.Scanner;
class parentsname
{
    String fname, mname;
    parentsname(String f, String m)
    {
        this.fname=f;
        this.mname=m;
    }
}
class student {
    int id;
    String name;
    parentsname pname;
    student(int id, String name, parentsname pname)
    {
        this.id=id;
        this.name=name;
        this.pname=pname;
    }
    void display() {
        System.out.println("Students id : " + id);
        System.out.println("Students name : " + name);
        System.out.println("Students fathers name : " + pname.fname +"\n"+ "Students mothers name : " + pname.mname);
    }
}
public class aggeragation {
    public static void main(String[] args) {
        //Scanner cin = new Scanner(System.in);       //couldnt work out input with this aggeragation
        parentsname p1 = new parentsname("Sayed Shariq Ali", "Shahla Qamr");
        student s1 = new student(1, "Sayed Amaan Ali", p1);
        s1.display();
    }
}