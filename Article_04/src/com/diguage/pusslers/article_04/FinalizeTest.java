package com.diguage.pusslers.article_04;

/**
 * finalize()方法的使用
 *  <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 上午11:17
 */
public class FinalizeTest {
    // 重写finalize()方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("执行了finalize()方法");
    }


    public static void main(String[] args) {
        FinalizeTest ft = new FinalizeTest();
        ft = null;
        System.gc();
    }
}
