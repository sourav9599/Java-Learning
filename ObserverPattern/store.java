package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailNotification;
import ObserverPattern.Observer.MobileNotification;
import ObserverPattern.Observer.NotificationObserver;

public class store {
    public static void main(String[] args){
        StockObservable iphoneObservable = new IphoneStockObservable();
        NotificationObserver person1 = new EmailNotification("xyz@gmail.com", iphoneObservable);
        NotificationObserver person2 = new MobileNotification("98645555322", iphoneObservable);

        iphoneObservable.add(person1);
        iphoneObservable.add(person2);

        iphoneObservable.setStockQuantity(5);


    }
}
