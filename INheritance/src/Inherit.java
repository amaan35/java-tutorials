interface A{
    void showA();
}
interface B{
    void showB();
}
public class Inherit implements A,B
{
    public static void main(String[] args) {
        Inherit i = new Inherit();
        i.showA();
        i.showB();
    }

    @Override
    public void showA() {
        System.out.println("interface A");
    }

    @Override
    public void showB() {
        System.out.println("interface B");
    }
}

