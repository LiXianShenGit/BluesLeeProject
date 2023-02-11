package com.design.modle.brage;

/**
 * @author Mr Li
 * @date 2021-05-12下午 10:08
 */
public class XuanZhuanPhone extends Phone {
    public XuanZhuanPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("旋转样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("旋转样式手机");
    }

    @Override
    public void send() {
        super.send();
        System.out.println("旋转样式手机");
    }
}
