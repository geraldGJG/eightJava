package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReducerTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        int count = Stream.of(1,2,3).reduce(0,(acc,element) -> acc + element);
        System.out.println(count);
    }


}
