package aplication;

import entities.*;
import entities.enums.OrderStatus;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class program {
    public static void main(String[] args) throws ParseException {
        Scanner inp = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("------------------");
        System.out.println("Enter client data");
        System.out.print("name: ");
        String name = inp.nextLine();
        System.out.print("email: ");
        String email = inp.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(inp.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("------------------");
        System.out.println("Enter order data: ");
        OrderStatus status = OrderStatus.valueOf(inp.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?");
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("------------------");
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = inp.next();
            System.out.print("Product price: ");
            Double productPrice = inp.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = inp.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println(order);
        inp.close();
    }
}