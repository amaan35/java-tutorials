public class MultiThreadedClass extends Thread{

    private int threadNumber;
    public MultiThreadedClass(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i + " from thread of Class1 "+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
