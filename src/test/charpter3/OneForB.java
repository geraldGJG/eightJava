package test.charpter3;

import bean.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.print.Collation;

/**
 * @ClassName OneForB
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/17  18:17
 * @Version 1.0
 **/
public class OneForB {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("gerald","24","男"));
        students.add(new Student("justinberber","24","男"));
        students.add(new Student("lxn","24","男"));
        students.add(new Student("c","24","男"));
        students.add(new Student("geraldverywelllforjava","24","男"));
        List<String> names = students.stream().map(student -> {
            System.out.println(student.getName());
            return student.getName();
        }).collect(Collectors.toList());
        List<String> age = students.stream().map(student -> {
            System.out.println(student.getAge());
            return student.getAge();
        }).collect(Collectors.toList());

        List<String> nameAndAge = students.stream().flatMap(student -> Stream.of(student.getName(),student.getAge())).collect(Collectors.toList());
        nameAndAge.stream().filter(string -> {
            System.out.println("----------");
            System.out.println(nameAndAge);
            return true;
        }).collect(Collectors.toList());
    }
}