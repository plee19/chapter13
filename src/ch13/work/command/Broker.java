package ch13.work.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        double orderSum = 0;
        for (Order order : orderList) {
            order.execute();
            orderSum += order.getValue();
        }
        orderList.clear();
        System.out.println("Order total is: " + orderSum);
    }
}
