package com.galaxy.calculator.beans;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class orders {
    private HashMap<goods,Integer> items;
    private int totalCredits;

    public orders(HashMap<goods, Integer> items) {
        this.items = items;
    }

    public int getTotalCredits(){
        Iterator it = items.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<goods, Integer> entry=(Entry<goods, Integer>) it.next();
            goods goods = entry.getKey();
            totalCredits += goods.getUnitCredits() * entry.getValue();
        }
        return totalCredits;
    }

}
