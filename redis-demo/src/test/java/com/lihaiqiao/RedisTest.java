package com.lihaiqiao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    //    @Autowired
//    private  RedisTemplate<String,String> redisTemplate;
//
    @Autowired
    private TestCompones testCompones;

//    @Test
//    public void redisTest1() throws InterruptedException {
//        long startTime = System.currentTimeMillis();
//        CountDownLatch countDownLatch = new CountDownLatch(20);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i< 100000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程1========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 100001; i< 200000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程2========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 200001; i< 300000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程3========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 300001; i< 400000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程4========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 400001; i< 500000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程5========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 500001; i< 600000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程6========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 600001; i< 700000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程7========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 700001; i< 800000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程8========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 800001; i< 900000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程9========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 900001; i< 1000000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程10========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1000001; i< 1100000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程11========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1100001; i< 1200000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程12========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1200001; i< 1300000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程13========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1300001; i< 1400000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程14========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1400001; i< 1500000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程15========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1500001; i< 1600000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程16========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1600001; i< 1700000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程17========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1700001; i< 1800000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程18========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1800001; i< 1900000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程19========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1900001; i< 2000000; i++) {
//                    redisTemplate.opsForValue().set("charge:bill:main:20220110"+i, i+"");
//                    System.out.println("线程20========"+i);
//                }
//                countDownLatch.countDown();
//            }
//        },Thread.currentThread().getName()).start();
//
//        countDownLatch.await();
//        long endTime = System.currentTimeMillis();
//        System.out.println("总耗时：time:"+(endTime-startTime));
//    }

    @Test
    public void flusTest() {
        ByteBuffer allocate = ByteBuffer.allocate(10);
        for (int i = 0; i < allocate.capacity(); i++) {
            allocate.put((byte) i);
        }
        allocate.position(0);
        allocate.limit(allocate.capacity());
        while (allocate.hasRemaining()) {
            System.out.println(allocate.get());
        }
    }

    @Test
    public void testReadFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\test\\test.txt");
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            byte[] array = buffer.array();
            System.out.print(new String(array));
        }
        buffer.clear();
        channel.close();
    }


    @Test
    public void testSlector() throws IOException {
        Selector open = Selector.open();
        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);
        ServerSocket socket = server.socket();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(6633);
        socket.bind(inetSocketAddress);
        open.select();
        server.register(open, SelectionKey.OP_ACCEPT);
    }

}
