package com.java.design.pattern.adapter;
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
