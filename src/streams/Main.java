package streams;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("one");
        set.add("two");
        set.add("three");

        Stream stream = set.stream();

        stream.filter((x) -> x.equals("one"))
                .forEach(System.out::println)  ;


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Optional<String> reduced =  names .stream() .sorted()
                        .reduce((s1, s2) -> s1 + s2);

        reduced.ifPresent((String x) -> {
            System.out.println(x);
        });

        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long count = values.stream().sorted().count();
        System.out.println(count);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(   value -> value.intValue())
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}
