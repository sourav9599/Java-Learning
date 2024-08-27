package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    List<NotificationObserver> notificationObservers = new ArrayList<>();
    int stockQuantity = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObservers.add(notificationObserver);

    }
    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObservers.remove(notificationObserver);
    }

    @Override
    public void notification() {
        for(NotificationObserver x: notificationObservers){
            x.update();
        }
    }

    @Override
    public void setStockQuantity(int stock) {
        if(stockQuantity == 0) {
            stockQuantity += stock;
            notification();
        }

    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }
}
