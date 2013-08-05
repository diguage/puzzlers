package com.diguage.pusslers.article_05;

/**
 * 测试基本类型的传递
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午4:21
 */
public class BooleanTest {
    // 布尔型值
    boolean bool = true;

    // 为布尔型参数重新赋值
    public void change(boolean b) {
        b = false;
    }

    // 对布尔型参数进行计算
    public void calculate(boolean b) {
        b = b && false;
        // 为了方便对比，将运算结果输出
        System.out.println("b运算后的值：" + b);
    }

    public static void main(String[] args) {
        BooleanTest t = new BooleanTest();

        System.out.println("参数--布尔型");
        System.out.println("原有的值：" + t.bool);
        // 为布尔型参数重新赋值
        t.change(t.bool);
        System.out.println("赋值之后：" + t.bool);

        //改变布尔值参数的值
        t.calculate(t.bool);
        System.out.println("运算之后：" + t.bool);
    }
}
