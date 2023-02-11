package com.lihaiqiao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.Consumer;

@Component
public class TestCompones {

  private   List<Consumer<Test2>>  list;

  @Autowired
    public TestCompones(List<Consumer<Test2>> list) {
        this.list = list;
    }

    public void send(){
        Test2 test2 = new Test2();
        test2.setName("历史");
        for (Consumer consumer : list) {
            Disposable subscribe = Flux.just(test2).subscribe(consumer);
        }
    }
}
