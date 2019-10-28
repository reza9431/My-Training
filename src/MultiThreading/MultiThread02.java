package MultiThreading;

public class MultiThread02 implements Runnable {

    public void run(int a , int b) {
        System.out.println("Testttt 02");
        System.out.println("Testttt 03");
        System.out.println(a*b);


    }

    public static void main(String[] args) {
        System.out.println("testttt 01");

        MultiThread02 mu2 = new MultiThread02();

        Thread t2 = new Thread(mu2);
        t2.start();


        mu2.run(5,8);

        System.out.println("Testttt 04");

    }

    @Override
    public void run() {

    }
}
