package com.design.modle.brage;

/**
 * @author Mr Li
 * @date 2021-05-12下午 10:07
 */
public class HuaWeiPhone implements Brand {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void send() {
        System.out.println("华为手机发短信");
    }
}
