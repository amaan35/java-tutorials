public class MultiThreadedClass2 implements Runnable{
    private int threadNo;
    public MultiThreadedClass2(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i + " from thread of Class2 "+ threadNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
