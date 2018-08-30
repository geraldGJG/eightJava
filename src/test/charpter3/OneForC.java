package test.charpter3;

import bean.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName OneForC
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/17  18:43
 * @Version 1.0
 **/
public class OneForC {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("gerald","24","男"));
        students.add(new Student("justinberber","24","男"));
        students.add(new Student("lxn","24","男"));
        students.add(new Student("c","24","男"));
        students.add(new Student("geraldverywelllforjava","24","男"));
        List<String> names = students.stream().map(student -> student.getName()).filter(string -> string.length()>5).collect(Collectors.toList());

    }
}