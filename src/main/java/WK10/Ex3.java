package WK10;

public class Ex3 implements Runnable {
    private int sum = 0;

    public static void main(String[] args) {
        Ex3 test = new Ex3();
        for (int i = 0; i < 3; i ++) {
           new Thread(test).start();

        }
    }
    //Without syncronized, all of the thread run parally
    public void count() {
        for(int i = 0; i < 100; i ++) {
            ++ sum;
            System.out.println(this.sum);
        }
    }
    @Override
    public void run() {
        count();
    }
}
