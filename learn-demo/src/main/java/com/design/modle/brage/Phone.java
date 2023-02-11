package com.design.modle.brage;

/**
 * @author Mr Li
 * @date 2021-05-12下午 10:06
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call(){
        this.brand.call();
    }

    public void close(){
        this.brand.close();
    }

    public void send(){
        this.brand.send();
    }

}
