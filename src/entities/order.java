package entities;

import java.util.Date;
import entities.enums.OrderStatus;


public class order {
    private Date moment;
    private OrderStatus  status;
    private client client;
    
    public order(){
    }
    public order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
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
}