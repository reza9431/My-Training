package MultiThreading;

public class MultiThread01 extends Thread {

    public void run(){
        System.out.println("Num 1");
        System.out.println("Num 2");

    }

    public static void main(String[] args) {

        System.out.println("Num 3");

        MultiThread01 newfile = new MultiThread01();
        newfile.run();


        System.out.println("Num 4");


    }


}


