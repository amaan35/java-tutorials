public class Lambdas {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        //dog.print();
        Interface i = (suffix)->System.out.println("Bark"+suffix);
        printHere(i);
    }
    static public void printHere(Interface i){
        i.print(" woof woof");
    }
}
