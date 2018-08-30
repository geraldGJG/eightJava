package test;

import bean.Student;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(100);

        Stream<String> collected = Stream.of("a","b","hello").map(string -> {
            System.out.println("sssss");
            return string.toUpperCase();
        });

        integers.stream().filter(integer -> {
            System.out.println(integer);
            BinaryOperator<Integer> add = (x,y)->x+y;
            System.out.println("add:"+add.apply(integer,integer));
            return integer.equals(13);
        }).count();


        List<String> list = Stream.of("a","b","c").collect(Collectors.toList());
        System.out.println(Arrays.asList("a","b","c").equals(list));
        System.out.println(Stream.of("a","b","c").collect(Collectors.toList()));
    }
}
