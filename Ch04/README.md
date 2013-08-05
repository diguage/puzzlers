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