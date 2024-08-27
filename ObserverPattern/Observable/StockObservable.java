package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notification();
    void setStockQuantity(int stockQuantity);
    int getStockQuantity();

}
