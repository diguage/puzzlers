### finally语句的执行


#### finally与return
有语句如下：

```java
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
```

没想到这里竟然 **先执行第一个return，然后在执行finally语句。**


#### finally与continue

```java
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
```

**执行完continue后，还执行finally语句。**


#### finally与break

```java
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
```

**执行完break后，还执行finally语句。**

#### 总计

**问题：** return 是退出当前方法，并将值或者对象返回。执行了return方法后，退出当前方法了，还怎么执行finally呢？那么执行顺序究竟是怎么样的呢？

**解答：** 正确的执行顺序：编译器在编译`return new ReturnClass();`时，将它分成了两个步骤，`new ReturnClass()`和`return`，前一个创建对象的语句是在finally语句执行之前被执行的，而后一个return是在finally语句块之后执行的，也就是说finally 语句块是在程序退出方法之前被执行的。同样，finally语句块实在循环被跳过（continue）和中断（break）之前被执行的。
