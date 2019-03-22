package com.galaxy.calculator.beans;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ordersTest {
    private  orders orders;

    @Before
    public void setUp() throws Exception {
        HashMap<goods,Integer> map = new HashMap<>();
        goods goods = new goods("goods_name",30);
        map.put(goods,2);
        this.orders = new orders(map);
    }

    @Test
    public void getTotalCredits() {
        System.out.println(orders.getTotalCredits());
    }
}