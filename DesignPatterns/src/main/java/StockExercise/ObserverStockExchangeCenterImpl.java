package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    @Override
    public void notifyChange(StockType type, double price){
        this.ownedStock.replace(type, price);
    }

    @Override
    public void observe(ObservableStock o){
        o.registerStockExchangeCenter(this);
    }

    @Override
    public void buyStock(ObservableStock s){
        this.ownedStock.put(s.getName(), 0.0);
        observe(s);
    }
}
