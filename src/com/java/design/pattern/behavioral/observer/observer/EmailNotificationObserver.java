package com.java.design.pattern.behavioral.observer.observer;

import com.java.design.pattern.behavioral.observer.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver {

    String emailId;
    StockObservable observable;

    public EmailNotificationObserver(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(this.emailId);
    }

    private void sendEmail(String emailId){
        System.out.println("Email Sent to " + emailId);
    }
}
