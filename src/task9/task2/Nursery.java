package task9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nursery {
    List<Order> orderList;
    String NurseryName;

    public Nursery(String NurseryName) {
        this.NurseryName = NurseryName;
        this.orderList = new ArrayList<>();
    }

    public List<Order> getList() {
        return orderList;
    }

    public String getNurseryName() {
        return NurseryName;
    }

    public void addOrder(Order... orders) {
        orderList.addAll(Arrays.asList(orders));
    }

    public void removeOrder(String nameOrder) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getNameBuyer().equals(nameOrder)) {
                orderList.remove(orderList.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Nursery{" +
                "orderList=" + orderList +
                ", cellNumber=" + NurseryName +
                '}';
    }
}
