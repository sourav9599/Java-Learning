package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailNotification implements NotificationObserver{
    String email;
    StockObservable stockObservable;

    public EmailNotification(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        // sendEmail(email, "Stock is available");
        System.out.println(email + "Stock is available" + stockObservable.getStockQuantity());
    }
}
