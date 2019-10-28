import java.util.Scanner;

public class MinAndMaxArray {
    public static void main(String[] args) {
       double arr[];
       double Min , Max;
       int i,n;

        Scanner input = new Scanner(System.in);
        System.out.println("How many Numbers?");
        n= input.nextInt();
        arr=new double[n];
        for (i=0 ; i<n ; i++){
            System.out.println("Enter the Numbers: ");
            arr[i]=input.nextDouble();

        }

        Min = arr[0];
        Max = arr[0];

        for (i=1 ; i<n ; i++){
            if (arr[i]<Min){
                Min = arr[i];

            }if (arr[i]>Max){
                Max = arr[i];
            }



        }

        System.out.println();
        System.out.println("The Max Element: \n" + Max);
        System.out.println("The Min Element: \n" + Min);

    }


}
