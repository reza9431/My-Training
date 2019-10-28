import java.util.Scanner;

public class InvertElements {
    public static void main(String[] args) {
        int array[];
        int tmp;
        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Now many Element");

        n = input.nextInt();
        array = new int[n];

        for (i = 0; i < n; i++) {

            System.out.println("Enter Element");
            array[i] = input.nextInt();

        }
        for (i = 0; i < n; i++) {

            System.out.print("\t" + array[i]);

        }

//        Inversion Block
        System.out.println("");
        for (i = 0; i < n / 2; i++) ;
        tmp = array[i];
        array[i] = array[n - i - 1];
        array[n - i - 1] = tmp;

        for (i = 0; i < n; i++) {
            System.out.print("\t" + array[i]);

        }


    }


}
