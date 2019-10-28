package DependencyTest.HardDep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        new Sun();
//        Set<Integer> set = new HashSet<>();
//        set.add(2323);
//        set.add(43534);
//        set.add(2323);
//        set.add(43536);

        List<Integer> set = new ArrayList<>();
        set.add(2323);
        set.add(54746);
        set.add(2323);
        set.add(67467);
        set.add(54746);

        for (int myse:set
             ) {
            System.out.println(myse);


        }

    }
}
