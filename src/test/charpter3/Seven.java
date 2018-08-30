package test.charpter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Seven
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/20  15:25
 * @Version 1.0
 **/
public class Seven {

    public static int countLowercaseLetters(String string){
        return (int)string.chars().filter(Character::isLowerCase).count();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fddFSD");
        list.add("");
        list.add("fdsfafSD");
        list.add("DFd");
        list.stream().max(Comparator.comparing(Seven::countLowercaseLetters));
    }
}