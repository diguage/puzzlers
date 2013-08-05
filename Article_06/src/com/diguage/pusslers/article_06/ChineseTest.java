package com.diguage.pusslers.article_06;

/**
 * 测试中文在Java中的表现
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午5:37
 */
public class ChineseTest {
    public static void main(String[] args) {
        // 将一个中文汉字赋值给一个char变量
        char a = '中';
        char b = '文';
        char c = '测';
        char d = '试';
        char e = '成';
        char f = '功';

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(f);


        System.out.println("------------------");
        System.out.print("a + b + c + d + e + f = ");
        System.out.println(a + b + c + d + e + f);

        System.out.println("------------------");

        // 将一个英文字母赋值给一个byte变量
        byte ba = 'a';

        // 将一个中文汉字赋值给一个byte变量时，编译会报错
//        byte bb = '中';

        System.out.println(" byte ba = " + ba);
//        System.out.println(" byte bb = " + bb);
    }
}
