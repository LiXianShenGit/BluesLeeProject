package com.design.modle.single;

/**
 * @author Mr Li
 * @date 2021-05-07上午 10:30
 * 懒汉式单例  线程不安全
 */
public class IdlerSingle {

    private static IdlerSingle INSTANCE;

    private IdlerSingle() {

    }

    public static IdlerSingle getInstance() {
        if (INSTANCE == null) {
            return new IdlerSingle();
        }
        return INSTANCE;
    }
}


class IdlerSyncSingle {

    private static IdlerSyncSingle INSTANCE;

    private IdlerSyncSingle() {

    }

    public static synchronized IdlerSyncSingle getInstance() {
        if (INSTANCE == null) {
            return new IdlerSyncSingle();
        }
        return INSTANCE;
    }
}


class IdlerSyncModleSingle {

    private static volatile IdlerSyncModleSingle INSTANCE;

    private IdlerSyncModleSingle() {

    }

    public IdlerSyncModleSingle getInstance() {
        if (INSTANCE == null) {
            synchronized (this) {
                if (INSTANCE == null) {
                    return new IdlerSyncModleSingle();
                }
            }
        }
        return INSTANCE;
    }
}

class IdlerSingleTest {
    public static void main(String[] args) {
        IdlerSingle instance = IdlerSingle.getInstance();
        IdlerSingle instance1 = IdlerSingle.getInstance();
        System.out.println(instance == instance1);
    }
}
