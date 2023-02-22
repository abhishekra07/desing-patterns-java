package com.java.design.pattern.structural.adapter;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
