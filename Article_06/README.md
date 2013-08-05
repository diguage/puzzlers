# 扯淡字符串

在Java中，一个char是2个字节（byte），而一个中文汉字是一个字符，也是2个字节。

而英文字母都是一个字节的，因此英文可以保存到一个byte里，而中文汉字却不能。

`+`号用于字符串之间是拼接；用于字符之间，效果等同于用于数字和数字之间，是一种算术运算。

### 中文汉字和英文字母在不同编码下所占的字节数

```java
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
```

结果如下：

```
英文字母：A
字节数：1;编码：GB2312
字节数：1;编码：GBK
字节数：1;编码：GB18030
字节数：1;编码：ISO-8859-1
字节数：1;编码：UTF-8
字节数：4;编码：UTF-16
字节数：2;编码：UTF-16BE
字节数：2;编码：UTF-16LE

中文汉字：人
字节数：2;编码：GB2312
字节数：2;编码：GBK
字节数：2;编码：GB18030
字节数：1;编码：ISO-8859-1
字节数：3;编码：UTF-8
字节数：4;编码：UTF-16
字节数：2;编码：UTF-16BE
字节数：2;编码：UTF-16LE
```