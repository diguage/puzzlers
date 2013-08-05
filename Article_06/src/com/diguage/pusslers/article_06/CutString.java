package com.diguage.pusslers.article_06;

import java.io.UnsupportedEncodingException;

/**
 * 字符串切割
 * <p/>
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-5
 * Time: 下午6:47
 */
public class CutString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "我ZWR爱Java";

        //获取GBK编码下的字节数据
        byte[] data = s.getBytes("GBK");
        byte[] tmp = new byte[6];
        //将data数组的前六个字节拷贝到tmp数组中
        System.arraycopy(data, 0, tmp, 0, 6);

        // 将截取到的前六个字节以字符串的形式输出到控制台
        s = new String(tmp);
        System.out.println(s);
    }
}
