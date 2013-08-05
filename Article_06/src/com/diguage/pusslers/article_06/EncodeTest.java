package com.diguage.pusslers.article_06;

import java.io.UnsupportedEncodingException;

/**
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午6:28
 */
public class EncodeTest {

    /**
     * 打印字符串在指点编码下的字节数和编码名称到控制台
     *
     * @param s            字符串
     * @param encodingName 编码格式
     */
    public static void printByteLength(String s, String encodingName) {
        System.out.print("字节数：");
        try {
            System.out.print(s.getBytes(encodingName).length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(";编码：" + encodingName);
    }

    public static void main(String[] args) {
        String en = "A";
        String ch = "人";

        // 计算一个英文字母在各个编码下的字节数
        System.out.println("英文字母：" + en);
        EncodeTest.printByteLength(en, "GB2312");
        EncodeTest.printByteLength(en, "GBK");
        EncodeTest.printByteLength(en, "GB18030");
        EncodeTest.printByteLength(en, "ISO-8859-1");
        EncodeTest.printByteLength(en, "UTF-8");
        EncodeTest.printByteLength(en, "UTF-16");
        EncodeTest.printByteLength(en, "UTF-16BE");
        EncodeTest.printByteLength(en, "UTF-16LE");

        System.out.println();

        // 计算一个中文汉字在各个编码下的字节数
        System.out.println("中文汉字：" + ch);
        EncodeTest.printByteLength(ch, "GB2312");
        EncodeTest.printByteLength(ch, "GBK");
        EncodeTest.printByteLength(ch, "GB18030");
        EncodeTest.printByteLength(ch, "ISO-8859-1");
        EncodeTest.printByteLength(ch, "UTF-8");
        EncodeTest.printByteLength(ch, "UTF-16");
        EncodeTest.printByteLength(ch, "UTF-16BE");
        EncodeTest.printByteLength(ch, "UTF-16LE");
    }
}
