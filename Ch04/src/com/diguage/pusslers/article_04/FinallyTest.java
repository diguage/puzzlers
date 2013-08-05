package com.diguage.pusslers.article_04;

/**
 * 测试finally语句的作用
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 上午9:32
 */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("程序抛出了异常");
        } finally {
            System.out.println("执行了finally语句块");
        }
    }
}
