package MapPractice;

import java.util.*;

public class DictionaryMap {


    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        map.put("Sunday", "Sontag");
        map.put("Monday", "Montag");
        map.put("Tuesday", "Dienstag");
        map.put("Wednesday", "Mittwoch");
        map.put("Thursday", "Donnerstag");
        map.put("Friday", "Freitag");
        map.put("Sutarday", "Samstag");

        DictionaryMap.interatorMap(map);

    }


    public static void interatorMap(Map<String, String> map) {
//        map.forEach((k, v) -> System.out.println("Englich => " + k + "\t || Germany => " + v));


        String newstart;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println();



            System.out.println("Enter your Week Day to translation : ");

            String se = input.nextLine();


            System.out.println("Das Ergebnis auf Deutsch ist:  ==> " + map.get(se));

            if (map.get(se) == null) {

                System.out.println("======= Sorry!! Your request not found! =======");

                System.out.println("Would you like to see the content? (Y/N)");

                String ans = input.next();
                if (ans.equals("y") || ans.equals("Y")) {

                    map.forEach((k, v) -> System.out.println("Englich => " + k + "\t || Germany => " + v));
                }

            }


            System.out.println("Do you want to continue ? (y/n) ");
            newstart = input.next();
        }   while (newstart.equals("y"));


    }
}

