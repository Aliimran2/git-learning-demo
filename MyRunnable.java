public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("thread using runnable");
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);

        t.run();

    }
    
}
