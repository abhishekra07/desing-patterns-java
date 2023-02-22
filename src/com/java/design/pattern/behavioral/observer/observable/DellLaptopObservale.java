package com.java.design.pattern.behavioral.observer.observable;

import com.java.design.pattern.behavioral.observer.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class DellLaptopObservale implements StockObservable {

    List<NotificationObserver> observers = new ArrayList<>();
    int stock = 0;

    /**
     * @param observer
     */
    @Override
    public void add(NotificationObserver observer) {
        observers.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(NotificationObserver observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifyAllObserver() {
        for(NotificationObserver observer: observers) {
            observer.update();
        }
    }

    /**
     * @param newStockNo
     */
    @Override
    public void setStock(int newStockNo) {
        if(stock == 0 && newStockNo != 0){
            notifyAllObserver();
        }
        stock += newStockNo;
    }

    /**
     * @return
     */
    @Override
    public int getStock() {
        return stock;
    }
}
