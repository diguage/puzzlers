# final、finally和finalize的区别

## final的用法

final变量的定义

1. 在定义时初始化
2. 在初始化块中初始化
3. 非静态final变量不能在静态代码块中初始化
4. 静态常量，在定义时初始化
5. 静态常量，在静态初始化块中初始化
6. 静态常量不能在初始化块中初始化
7. 静态final变量不可以在构造器中初始化
8. 在构造器中初始化
9. 给final的变量第二次赋值时，编译会报错
10. final变量未被初始化，编译时会报错
11. 静态final变量未被初始化，编译时会报错

## finally语句的执行

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

#### 总结

**问题：** return 是退出当前方法，并将值或者对象返回。执行了return方法后，退出当前方法了，还怎么执行finally呢？那么执行顺序究竟是怎么样的呢？

**解答：** 正确的执行顺序：编译器在编译`return new ReturnClass();`时，将它分成了两个步骤，`new ReturnClass()`和`return`，前一个创建对象的语句是在finally语句执行之前被执行的，而后一个return是在finally语句块之后执行的，也就是说finally 语句块是在程序退出方法之前被执行的。同样，finally语句块实在循环被跳过（continue）和中断（break）之前被执行的。

> 还可以通过查看编译后的class文件来确定！
>
> 1. 执行`javac -g <ClassName.java>` // 编译源码
> 2. 执行`javap -c -s -l -verbose <ClassName>` // 查看编译结果


## finalize方法
`finalize()`方法是在GC清理它所属的对象时被调用，如果执行它的过程中抛出了无法捕获的异常(uncaught exception)，GC将终止对该对象的清理，并且该异常会被忽略；直到下一次GC开始清理这个对象时，它的`finalize()`会被再次调用。