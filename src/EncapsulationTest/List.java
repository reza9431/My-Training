package EncapsulationTest;

import com.sun.jmx.snmp.tasks.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fname = "";
        String lname = "";
        String ans = "";

        ArrayList list = new ArrayList<String>(2);


        do {
            System.out.println("Please enter your name: ");

            fname = input.nextLine();
            list.add(fname);


            System.out.println("Please enter your lastname: ");
            lname = input.nextLine();
            list.add(lname);

            if (fname.isEmpty() || lname.isEmpty()) {


                System.out.println("You have Nothing Entered!");
                System.out.println("try again?  y  or n");
                ans = input.nextLine();

            }


        } while (ans.equalsIgnoreCase("Y"));


        System.out.println("Hello  \n" + list + "");


    }
}







