import EncapsulationTest.Class01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTraining {
    public static void main(String[] args) {
        List<String> list01 = new ArrayList<String>();
        list01.add("aaa");
        list01.add("ddd");
        list01.add("bbbb");

        List<String> filterd = list01.stream().filter(list02 -> list01.isEmpty())
                .collect(Collectors.toList());


        System.out.println(list01);
        System.out.println(filterd);


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);




    }

}
