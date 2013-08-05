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

    /**
     * 判断是否是一个汉字
     *
     * @param c 字符
     * @return true表示是中文汉字，false表示是英文字母
     * @throws UnsupportedEncodingException 使用了Java不支持的编码格式
     */
    public static boolean isChineseChar(char c) throws UnsupportedEncodingException {
        // 如果字节大于1，是汉字
        // 以这种方式区别英文字母和中文汉字并不十分严谨，但是在这个题目中，这样判断已经足够了。
        return String.valueOf(c).getBytes("GBK").length > 1;
    }

    /**
     * 按照字节截取字符串
     *
     * @param orignal 原始字符串
     * @param count   截取位数
     * @return 截取后的字符串
     * @throws UnsupportedEncodingException 使用了Java不支持的编码格式
     */
    public static String substring(String orignal, int count) throws UnsupportedEncodingException {
        // 原始字符不为null，也不是空字符串
        if (null != orignal && !"".equals(orignal)) {
            // 将原始字符串转换成GBK编码格式
            orignal = new String(orignal.getBytes(), "GBK");
            // 要截取的字节数大于0，且小于原始字符串的字节数
            if (count > 0 && count < orignal.getBytes("GBK").length) {
                StringBuilder sb = new StringBuilder();
                char c;
                for (int i = 0; i < count; i++) {
                    // charAt(int index)也是按照字符来分解字符串的
                    c = orignal.charAt(i);
                    sb.append(c);
                    if (CutString.isChineseChar(c)) {
                        // 遇到中文汉字，截取字节总数减1
                        --count;
                    }
                }
                return sb.toString();
            }
        }
        return orignal;
    }

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

        System.out.println("-----正确的方式-------------");

        System.out.println("原始字符串：" + s);
        System.out.println("截取前1位：" + CutString.substring(s, 1));
        System.out.println("截取前2位：" + CutString.substring(s, 2));
        System.out.println("截取前4位：" + CutString.substring(s, 4));
        System.out.println("截取前6位：" + CutString.substring(s, 6));
    }
}
