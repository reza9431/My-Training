package InheritanceTest;

public class  MySuper {
    int x = 1;
    int y = 6;

    MySuper() {
        System.out.print("-x" + x);
        new MySuper(5);
    }
    MySuper(int y) {
        System.out.print("-y" + y);
        x = 4;
    }
}



