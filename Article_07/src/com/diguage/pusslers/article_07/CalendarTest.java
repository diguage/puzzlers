package com.diguage.pusslers.article_07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calend使用
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午11:10
 */
public class CalendarTest {
    /**
     * 以一种较为友好的方式格式化日期时间值
     *
     * @param c 日期时间对象
     * @return 格式化后的日期时间字符串
     */
    public static String toFriendlyString(Calendar c) {
        if (null != c) {
            DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            return df.format(c.getTime());
        }
        return null;
    }

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        System.out.println("创建方式：Calendar.getInstance()");
        System.out.println("日期时间：" + CalendarTest.toFriendlyString(c1));
        System.out.println();

        Calendar c2 = new GregorianCalendar();
        System.out.println("创建方式：new GregorianCalendar()");
        System.out.println("日期时间：" + CalendarTest.toFriendlyString(c2));
        System.out.println();

        //参数含义依次为：年、月、日
        Calendar c3 = new GregorianCalendar(2008, 8, 8);
        System.out.println("创建方式：new GregorianCalendar(2008, 8, 8)");
        System.out.println("日期时间：" + CalendarTest.toFriendlyString(c3));
        System.out.println();

        // 参数含义依次为：年、月、日、时、分
        Calendar c4 = new GregorianCalendar(2008, 8, 8, 6, 10);
        System.out.println("创建方式：new GregorianCalendar(2008, 8, 8, 6, 10)");
        System.out.println("日期时间：" + CalendarTest.toFriendlyString(c4));
        System.out.println();

        // 参数含义依次为：年、月、日、时、分、秒
        Calendar c5 = new GregorianCalendar(2008, 8, 8, 18, 10, 5);
        System.out.println("创建方式：new GregorianCalendar(2008, 8, 8, 18, 10, 5)");
        System.out.println("日期时间：" + CalendarTest.toFriendlyString(c5));
        System.out.println();


    }
}
