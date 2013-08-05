package com.diguage.pusslers.article_05;

/**
 * 探索传值还是传引用
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午12:26
 */
public class ParamTest {
    // 初始值为0
    protected int num = 0;

    // 为方法参数重新赋值
    public void change(int i) {
        i = 5;
    }

    // 为方法参数重新赋值
    public void change(ParamTest t) {
        ParamTest tmp = new ParamTest();
        tmp.num = 9;
        t = tmp;
    }

    // 改变方法参数的值
    public void add(int i) {
        i += 10;
    }

    // 改变方法参数属性的值
    public void add(ParamTest pt) {
        pt.num += 20;
    }

    public static void main(String[] args) {
        ParamTest t = new ParamTest();

        System.out.println("参数--基本类型");
        System.out.println("原有的值：" + t.num);
        // 为基本类型参数重新赋值
        t.change(t.num);
        System.out.println("赋值之后：" + t.num);

        System.out.println("\n\n为引用类型参数重新赋值");
        t.change(t);
        System.out.println("运算之后：" + t.num);

        System.out.println("\n\n");

        t = new ParamTest();
        System.out.println("参数--引用类型");
        System.out.println("原有的值：" + t.num);
        // 改变基本类型参数的值
        t.add(t.num);
        System.out.println("赋引用后：" + t.num);
        // 改变引用类型参数所指向对象的属性值
        t.add(t);
        System.out.println("改属性后：" + t.num);

    }
}
