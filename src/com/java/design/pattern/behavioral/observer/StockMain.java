package com.java.design.pattern.behavioral.observer;

import com.java.design.pattern.behavioral.observer.observable.DellLaptopObservale;
import com.java.design.pattern.behavioral.observer.observable.StockObservable;
import com.java.design.pattern.behavioral.observer.observer.EmailNotificationObserver;
import com.java.design.pattern.behavioral.observer.observer.NotificationObserver;
import com.java.design.pattern.behavioral.observer.observer.SMSNotificationObserver;

public class StockMain {
    public static void main(String[] args) {
        StockObservable dellObservable = new DellLaptopObservale();

        NotificationObserver emailObserver1 = new EmailNotificationObserver(dellObservable, "abhishek.rathore@gmail.com");
        NotificationObserver emailObserver2 = new EmailNotificationObserver(dellObservable, "abhishek.sharma@gmail.com");
        NotificationObserver smsObserver1 = new SMSNotificationObserver(dellObservable, "+91-44444444444");
        NotificationObserver smsObserver2 = new SMSNotificationObserver(dellObservable, "+91-22222222222");

        dellObservable.add(emailObserver1);
        dellObservable.add(emailObserver2);
        dellObservable.add(smsObserver1);
        dellObservable.add(smsObserver2);

        dellObservable.setStock(10);
    }
}
