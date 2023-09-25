public class MultiThreading {
    public static void main(String[] args) {

        for(int i=1; i<=3; i++){
            MultiThreadedClass mtc = new MultiThreadedClass(i);
            mtc.start();
        }

        for(char i = 1; i<=3; i++){
            MultiThreadedClass2 mtc2 = new MultiThreadedClass2(i);
            Thread thread = new Thread(mtc2);
            thread.start();
        }
    }
}
