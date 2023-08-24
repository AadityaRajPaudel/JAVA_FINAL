// multithreading 


public class Multithreads extends Thread{
    public void run() {
        try {
            for (int i = 1; i <=6; i++) {
                System.out.print(i);
                Thread.sleep(2000);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String [] args) {
        Multithreads m1 = new Multithreads();
        Multithreads m2 = new Multithreads();
        m1.start();
        m2.start();
    }
}
