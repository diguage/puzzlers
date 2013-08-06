# 时间日期处理

Java中的月份是从0开始的，它用来表示月份的数值总是比实际月份值小1。为了避免错误，推荐使用Calendar中的常量来代替直接使用数字表示月份。

Calendar下的一堆常量。

在DateFormat参数中，如果需要输出英文字母，则使用单引号括起来，否则会报异常：java.lang.IllegalArgumentException。