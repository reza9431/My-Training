package InheritanceTest;

public class MySub extends MySuper {
    int w = 4;

    MySub(int w) {
        System.out.print("-w" + w);
    }
    public static void main(String[] args){
        MySuper mySub = new MySuper(2);
    }

}
