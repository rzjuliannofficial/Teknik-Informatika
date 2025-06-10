package WEEK14;
import java.util.ArrayList;

public class DemoArrayList17 {
    public static void main(String[] args) {
        ArrayList<Customer17> customers = new ArrayList<>(2);

        Customer17 customer1 = new Customer17(1, "Zakia");
        Customer17 customer2 = new Customer17(2, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        for (Customer17 cust : customers) {
            System.out.println(cust.toString());
        }
    }    
}
