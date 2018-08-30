package test;

import bean.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static com.sun.javafx.fxml.expression.Expression.add;

public class LambdaTest {

    private void test(String event){
        System.out.println(event);
    }

    public static void main(String[] args) {
        BinaryOperator<Long> add = (Long x,Long y) -> x+y;
        System.out.println("Hello World!");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<Student> students = new ArrayList<>();
        Student studentTest = new Student();
        studentTest.setAge("13");
        studentTest.setName("gerald");
        studentTest.setSex("男");
        studentTest.setAge("14");
        studentTest.setName("luxi");
        studentTest.setSex("女");
        students.add(studentTest);
        Stream stream = students.stream().filter(student ->
        { System.out.println(student.getName());
                return student.getSex().equals("女");});

        students.stream().filter(student -> {
            System.out.println(student.getName());
            return student.getSex().equals("女");
        }).count();





    }
}
