package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.*;

public class toUpperCaseTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        List<String> collected = Stream.of("a","b","c").map(string -> string.toUpperCase()).collect(toList());
        List<String> collected2 = Stream.of("3","2","1").collect(toList());
       // System.out.println(Stream.of("A","B","C").collect(toList()).equals(collected));

        List<String> togeter = Stream.of(collected,collected2).flatMap(strings -> strings.stream()).collect(toList());
        togeter.stream().filter(string->{
            System.out.println(string);
            return true;
        }).count();
        //filter TEST
        List<String> beginningWithNumbers = Stream.of("a","1dfd","dsf2").filter(string -> isDigit(string.charAt(0))).collect(toList());
      //  System.out.println(beginningWithNumbers.get(0));
    }
}
