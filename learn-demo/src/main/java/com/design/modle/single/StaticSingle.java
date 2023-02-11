package com.design.modle.single;

/**
 * @author Mr Li
 * @date 2021-05-07上午 10:12
 * 饿汉式静态方法单例
 */
public class StaticSingle {

    private static StaticSingle INSTANCE = new StaticSingle();

    private StaticSingle() {

    }

    public static StaticSingle getInstace() {
        return INSTANCE;
    }
}

/**
 * 饿汉式 静态代码块 单例
 */
class StaticModle {
    private static StaticModle INSTANCE2;

    static {
        INSTANCE2 = new StaticModle();
    }
    private StaticModle() {

    }
    public static StaticModle getInstace() {
        return INSTANCE2;
    }

}

class Main {
    public static void main(String[] args) {
        StaticSingle instace = StaticSingle.getInstace();
        StaticSingle instace2 = StaticSingle.getInstace();
        System.out.println(instace == instace2);
        StaticModle instace1 = StaticModle.getInstace();
        StaticModle instace3 = StaticModle.getInstace();
        System.out.println(instace1==instace3);
    }
}
