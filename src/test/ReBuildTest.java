package test;

import bean.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReBuildTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("gerald","24","男"));
        students.add(new Student("justinberber","24","男"));
        students.add(new Student("lxn","24","男"));
        students.add(new Student("c","24","男"));
        students.add(new Student("geraldverywelllforjava","24","男"));
        List<String> names = students.stream().map(student -> student.getName()).filter(name -> name.length()>5).collect(Collectors.toList());
        for (String s:names
        ) {
            System.out.println(s);
        }
        names.stream().filter(name->{
            System.out.println(name);
            return name.length()==6;
        }).collect(Collectors.toList());

    }
}
