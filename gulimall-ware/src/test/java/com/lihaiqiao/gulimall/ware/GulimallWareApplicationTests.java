package com.lihaiqiao.gulimall.ware;

import org.apache.zookeeper.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
public class GulimallWareApplicationTests {

    private String connectionStr = "120.79.89.168:2181";
    private int time = 15000;
    private ZooKeeper zooKeeper;

    @Before
    public void contextLoads() throws IOException {
        zooKeeper = new ZooKeeper(connectionStr, time, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.printf("创建节点");
            }
        });
    }

    @Test
    public void create() throws KeeperException, InterruptedException {
//        String s = zooKeeper.create("/test", "lihaiqiao".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//        System.out.printf(s);
        List<String> children = zooKeeper.getChildren("/test", false);
        System.out.printf(children.toString());
    }

}
