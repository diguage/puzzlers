### finally语句的执行

有语句如下：

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

没想到这里竟然先执行第一个return，然后在执行finally语句。