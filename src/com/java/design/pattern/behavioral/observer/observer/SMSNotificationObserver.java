package com.java.design.pattern.behavioral.observer.observer;

import com.java.design.pattern.behavioral.observer.observable.StockObservable;

public class SMSNotificationObserver implements NotificationObserver {

    String mobileNo;
    StockObservable observable;

    public SMSNotificationObserver(StockObservable observable, String mobileNo) {
        this.observable = observable;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {
        sendSMS(this.mobileNo);
    }

    private void sendSMS(String mobileNo){
        System.out.println("SMS Sent to " + mobileNo);
    }
}
