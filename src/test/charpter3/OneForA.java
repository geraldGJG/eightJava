package test.charpter3;


import java.util.stream.Stream;

/**
 * @ClassName OneForA
 * @Description
 * @Author 郭进贵（2292122479@qq.com）
 * @Date 2018/8/17  18:10
 * @Version 1.0
 **/
public class OneForA {

    public static void main(String[] args) {
        int addUp = Stream.of(1,2,3,4,5).reduce((add,acc)->add+acc).get();
        System.out.println(addUp);
    }
}