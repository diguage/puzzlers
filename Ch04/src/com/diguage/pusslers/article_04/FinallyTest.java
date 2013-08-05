package com.diguage.pusslers.article_04;

/**
 * 测试finally语句的作用
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 上午9:32
 */
public class FinallyTest {
    // 测试return语句
    public ReturnClass testReturn() {
        try {
            return new ReturnClass();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("执行了finally语句");
        }
        return null;
    }

    // 测试continue语句
    public void testContinue() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(i);
                if (i == 1) {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("执行了finally语句");
            }
        }
    }

    // 测试break语句
    public void testBreak() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(i);
                if (i == 1) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("执行了finally语句");
            }
        }
    }

    public static void main(String[] args) {
        FinallyTest ft = new FinallyTest();
        System.out.println("------Return-------");
        // 测试return语句
        ft.testReturn();

        System.out.println("\n\n------Continue-------");
        // 测试continue语句
        ft.testContinue();


        System.out.println("\n\n------Break-------");
        // 测break语句
        ft.testBreak();
    }

}
