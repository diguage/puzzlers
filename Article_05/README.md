# 传引用还是传值？

通过程序可以得出：

1. 对于基本类型，在方法体内对方法参数进行重新赋值，并不会改变原有变量的值；
2. 对于引用类型，在方法体内对方法参数进行重新赋予引用，并不会改变原有变量所持有的引用；
3. 方法体内对参数进行运算，不影响原有变量的值；
4. 方法体内对参数所指向对象的属性进行运算，讲改变原有变量所指向对象的属性值。

当基本类型的变量被当作参数传递给方法时，Java虚拟机所做的工作是把这个值拷贝一份，然后把靠背后的值传递到了方法的内部。

**在基本类型被作为参数传递给方法时，是值传递。**

