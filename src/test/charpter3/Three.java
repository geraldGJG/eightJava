package test.charpter3;

/**
 * @ClassName Three
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/20  15:13
 * @Version 1.0
 **/
public class Three {

    public static void main(String[] args) {
        String str = "dagARFFdfFFSs";
        int  i = (int)str.chars().filter(Character::isLowerCase).count();
        System.out.println(i);
        System.out.println(str.chars().filter(Character::isLowerCase).count());
    }

}