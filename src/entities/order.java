package entities;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entities.enums.OrderStatus;


public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus  status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    
    public Order(){
    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public Client getClient(){
        return client;
    }
    public void setClient(Client client) {
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

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
      Double sum = 0.0;  
      for(OrderItem item: items){
          sum += item.subtotal();
      }
      return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
    }
}