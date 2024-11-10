public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("running then thread...");
    }


    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t.start();
    
    }
    
}
