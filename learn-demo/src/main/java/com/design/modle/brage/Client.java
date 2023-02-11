package com.design.modle.brage;

/**
 * @author Mr Li
 * @date 2021-05-12下午 10:13
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FolderPhone(new XiaomiPhone());
        phone1.call();
        phone1.close();
        phone1.send();

        Phone phone2 = new FolderPhone(new HuaWeiPhone());
        phone2.call();
        phone2.close();
        phone2.send();
    }
}
