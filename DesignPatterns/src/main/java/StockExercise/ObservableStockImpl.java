package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    private List<ObserverStockExchangeCenter> observers = new ArrayList<ObserverStockExchangeCenter>();

    public ObservableStockImpl(StockType name){
        super(name);
    }

    @Override
    public void notifyPriceChange(double price){
        for (ObserverStockExchangeCenter oc : observers) {
            oc.notifyChange(getName(), price);
        }
    }

    @Override
    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc){
        observers.add(oc);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
        notifyPriceChange(price);
    }
}
