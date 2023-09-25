public class Classes_Objects
{
    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student(), s4 = new student();     //multiple declaration
        student s5 = new student();
        student s6 = new student(6,"Hashmi");         //using parameterized constructor
        s1.id=1;                                            //initialization through reference
        s1.name="Amaan Ali";                                //initialization through reference
        System.out.println("student id : "+s1.id);          //printing through reference
        System.out.println("student name : "+s1.name);      //printing through reference
        s2.enterdata(2, "Muhammad Ali");              //initialization through method
        s2.showdata();                                      //printing through method
        s3.enterdata(3, "Sufiyan");
        s4.enterdata(4, "Rahban");
        s3.showdata();
        s4.showdata();
        s5.showdata();
        s6.showdata();
    }
}
class student
{
   int id;
   String name;
   student()                                                //default constructor used by s5
   {
       id=5;
       name="Hisham";
   }
   student(int c, String d)                                 //parameterized constructor used by s6
   {
       id=c;
       name=d;
   }
   void enterdata(int a, String b)
   {
       id=a;
       name=b;
   }
   void showdata()
   {
       System.out.println("student id : "+id +" student name : "+name);
   }
}