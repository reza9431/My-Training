import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class List_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Names to print: ");
        ArrayList<java.lang.String> mylist = new ArrayList<>();

        java.lang.String in;
        do {
            in = input.nextLine();
            if (in.equals("")) {
                break;
            }
            mylist.add(in);

        } while (!in.equals(""));
            System.out.println(mylist);
        }
    }











