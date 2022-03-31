package aplication;
import java.util.Scanner;

public class program{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("How many items to this order?");
        int n = inp.nextInt();
        for(int i =0; i<n; i++){
            System.out.println("Enter #" +i+ " item data:");
            System.out.print("Product name: ");
            String name = inp.next();
            System.out.print("Product price: ");
            Double price = inp.nextDouble();
            System.out.print("Quantity: ");
            int quantity = inp.nextInt();
        }
        inp.close();
    }
}