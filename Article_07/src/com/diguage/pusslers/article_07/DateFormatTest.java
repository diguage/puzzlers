package com.diguage.pusslers.article_07;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat 使用联系
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-6
 * Time: 上午11:04
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        //将字符串转化成日期
        String s = "2008-08-08";
        System.out.println("原始字符串：" + s);
        String pattern = "yyyy-MM-dd";
        System.out.println("对应的表达式：" + pattern);
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = dateFormat.parse(s);
        System.out.println("转化后的值：" + date);


        System.out.println("-----------------------");

        // 使用系统当前日期时间值创建一个Date对象
        Date now = new Date();

        // 创建一个日期格式表达式
        pattern = "年代：G; 年份：y; 月份：M; 日：d; 时(1~12)：h; " +
                "时（1~23）：H; 分：m; 秒：s; 毫秒：S; 星期：E; 上/下午:a; 时区：z;";

        // 使用日期格式表达式创建一个SimpleDateFormat对象
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        // 调用SimpleDateFormat类的format(Date date)方法对Date对象进行格式化，并返回格式化后的字符串
        // 该方法继承自java.text.DateFormat类
        System.out.println("1位：" + df.format(now));

        pattern = "年代：GG; 年份：yy; 月份：MM; 日：dd; 时(1~12)：hh; " +
                "时（1~23）：HH; 分：mm; 秒：ss; 毫秒：SS; 星期：EE; 上/下午:aa; 时区：zz;";
        // 调用 SimpleDateFormat 的applyPattern(String pattern)方法用新创建的日期格式表达式替换其原有的
        df.applyPattern(pattern);
        System.out.println("2位：" + df.format(now));

        pattern = "年代：GGG; 年份：yyy; 月份：MMM; 日：ddd; 时(1~12)：hhh; " +
                "时（1~23）：HHH; 分：mmm; 秒：sss; 毫秒：SSS; 星期：EEE; 上/下午:aaa; 时区：zzz;";
        // 调用 SimpleDateFormat 的applyPattern(String pattern)方法用新创建的日期格式表达式替换其原有的
        df.applyPattern(pattern);
        System.out.println("3位：" + df.format(now));


        pattern = "年代：GGGG; 年份：yyyy; 月份：MMMM; 日：dddd; 时(1~12)：hhhh; " +
                "时（1~23）：HHHH; 分：mmm; 秒：ssss; 毫秒：SSSS; 星期：EEEE; 上/下午:aaaa; 时区：zzzz;";
        // 调用 SimpleDateFormat 的applyPattern(String pattern)方法用新创建的日期格式表达式替换其原有的
        df.applyPattern(pattern);
        System.out.println("4位：" + df.format(now));


        pattern = "年代：GGGGG; 年份：yyyyy; 月份：MMMMM; 日：ddddd; 时(1~12)：hhhhh; " +
                "时（1~23）：HHHHH; 分：mmmm; 秒：sssss; 毫秒：SSSSS; 星期：EEEEE; 上/下午:aaaaa; 时区：zzzzz;";
        // 调用 SimpleDateFormat 的applyPattern(String pattern)方法用新创建的日期格式表达式替换其原有的
        df.applyPattern(pattern);
        System.out.println("5位：" + df.format(now));


        pattern = "年代：GGGGGG; 'Year'：yyyyyy; 'Month'：MMMMMM; 日：dddddd; 时(1~12)：hhhhhh; " +
                "时（1~23）：HHHHHH; 分：mmmmm; 秒：ssssss; 毫秒：SSSSSS; 星期：EEEEEE; 上/下午:aaaaaa; 时区：zzzzzz;";
        // 调用 SimpleDateFormat 的applyPattern(String pattern)方法用新创建的日期格式表达式替换其原有的
        df.applyPattern(pattern);
        System.out.println("6位：" + df.format(now));


    }
}
