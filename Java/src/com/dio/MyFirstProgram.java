package com.dio;

import com.dio.base.Order;

/**
* @author guiquintero
* @version 1.0.0
* @since Release 1.0.0
*/



public class MyFirstProgram {

    public static void main(String[] args) {
    	Order order = new Order("code1234", null);
        System.out.println(order);
    }
}
