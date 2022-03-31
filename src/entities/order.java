package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import entities.enums.OrderStatus;


public class order {
    private Date moment;
    private OrderStatus  status;
    private client client;
    private List<orderitem> items = new ArrayList<>();
    
    public order(){
    }
    public order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }
    public List<orderitem> getItems() {
        return items;
    }
    public client getClient(){
        return client;
    }
    public void setClient(client client) {
        this.client = client;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Date getMoment(){
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void addItem(orderitem item){
        items.add(item);
    }
    public void removeItem(orderitem item){
        items.remove(item);
    }
    public Double total(){
      Double sum = 0.0;  
      for(orderitem item: items){
          sum += item.subtotal();
      }
      return sum;
    }
}