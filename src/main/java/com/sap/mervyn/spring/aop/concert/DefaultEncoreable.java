package com.sap.mervyn.spring.aop.concert;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("i'm doing nothing");
    }
}
