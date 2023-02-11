package com.design.modle.brage;

/**
 * @author Mr Li
 * @date 2021-05-12下午 10:07
 */
public class XiaomiPhone implements Brand {

    @Override
    public void call(){
        System.out.println("小米手机打电话");
    }

    @Override
    public void close(){
        System.out.println("小米手机关机");
    }

    @Override
    public void send(){
        System.out.println("小米手机发短信");
    }
}
