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

    // 静态常量，在定义时初始化
    public static final int STATIC_D = 40;

    public static final int STATIC_E;

    // 静态常量，在静态初始化块中初始化
    static {
        STATIC_E = 50;
    }

    // 静态常量不能在初始化块中初始化
//    public static final int STATIC_F;
//
//    {
//        STATIC_F = 60;
//    }

    public final int G;

    // 静态final变量不可以在构造器中初始化
//    public static final int STATIC_H;

    // 在构造器中初始化
    public FinalTest() {
        G = 70;

        // 静态final变量不可以在构造器中初始化
//        STATIC_H = 80;

        // 给final的变量第二次赋值时，编译会报错
//        A = 90;
//        STATIC_D = 99;

    }

    // final变量未被初始化，编译时会报错
//    public final int I;

    // 静态final变量未被初始化，编译时会报错
//    public static final int STATIC_J;
}
