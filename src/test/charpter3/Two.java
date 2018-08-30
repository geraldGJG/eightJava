package test.charpter3;

import bean.Artist;
import bean.Student;
import bean.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Two
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/20  9:26
 * @Version 1.0
 **/
public class Two {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("gerald","24","男"));
        students.add(new Student("justinberber","24","男"));
        students.add(new Student("lxn","24","男"));
        students.add(new Student("c","24","男"));
        students.add(new Student("geraldverywelllforjava","24","男"));
        int all = students.stream().map(student -> Integer.valueOf(student.getAge())).reduce(0,Integer::sum);
        System.out.println(all);
    }

}