package test;

import bean.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinAndMaxTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        List<Student> students = Stream.of(new Student("15","gerald","男"),
                                            new Student("23","justin","男"),
                                            new Student("18","luxi","女")).collect(Collectors.toList());
        System.out.println(students.get(0).equals(students.stream().min(Comparator.comparing(student -> student.getName())).get()));
    }
}
