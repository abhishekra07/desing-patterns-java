package com.java.design.pattern.observer.observable;

import com.java.design.pattern.observer.observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifyAllObserver();

    public void setStock(int stockNo);

    public int getStock();

}
