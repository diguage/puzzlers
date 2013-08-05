package com.diguage.pusslers.article_04;

/**
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 上午11:37
 */
public class FinalTest {

    // 在定义时初始化
    public final int A = 10;

    public final int B;

    // 在初始化块中初始化
    {
        B = 20;
    }

    // 非静态final变量不能在静态代码块中初始化
//    public final int C;
//
//    static {
//        C = 30;
//    }


}
