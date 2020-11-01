package com.yangchn.defaultmethod;

/**
 * @author yangchn
 * @Description
 * @date 2020年11月01日
 * Copyright neusoft (c) 2020 .
 */
public interface Vehicle {

    default void print() {
        System.out.println("我是车辆");
    }
}
