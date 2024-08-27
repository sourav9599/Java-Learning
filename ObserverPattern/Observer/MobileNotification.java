package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileNotification implements NotificationObserver{
    String phone;
    StockObservable stockObservable;

    public MobileNotification(String phone, StockObservable stockObservable){
        this.phone = phone;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        // sendMsg(email, "Stock is available");
        System.out.println(phone + "Stock is available " + stockObservable.getStockQuantity());
    }
}
