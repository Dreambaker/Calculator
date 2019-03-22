package com.galaxy.calculator.tools;
import com.galaxy.calculator.beans.romanNum;
import com.galaxy.calculator.beans.goods;
import com.galaxy.calculator.beans.orders;
import java.util.HashMap;
public abstract class inputDispatcher {
    private static romanNum addRoman(String alias , String roman){
        return new romanNum(alias,roman);
    }
    private static goods goodsSpec(String name , int credits){
        return new goods(name,credits);
    }
    private static orders getOrders(String roman , goods goods){
        HashMap<goods,Integer> items = new HashMap<>();
        items.put( goods , new romanNum(roman).getarabic());
        return new orders(items);
    }

}
