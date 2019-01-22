package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Lambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
  String x="44";

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
        Converter<String,Integer> converter= System.out::println;
        Converter<String,Integer> converter2= System.out::println;
//        converter.convert("f") ;
//        converter2.convert("fffff") ;
//        converter2.convert3("fffff") ;
        List<String> names2 =null;
        Optional<List<String>> optional = Optional.of(names);
        System.out.println( optional.isPresent());
        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse(names);    // "bam"

        optional.ifPresent( (s) ->  System.out.println(s.size() ) );     // "b"

    }
}



@FunctionalInterface
interface Converter<EE, T> {
     void convert(EE from );
     default  void convert3(EE from){

     }
}