package com.lihaiqiao;

import java.util.function.Consumer;

class Test implements Consumer<Test2> {

        @Override
        public void accept(Test2 o) {
            String name = o.getName();
            System.out.println(name);
        }
    }