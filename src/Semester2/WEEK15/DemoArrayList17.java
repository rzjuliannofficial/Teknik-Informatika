package WEEK15;
import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList17 {
    public static void main(String[] args) {
        ArrayList<Customer17> customers = new ArrayList<>(2);

        Customer17 customer1 = new Customer17(1, "Zakia");
        Customer17 customer2 = new Customer17(2, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer17(3, "Cica"));

        customers.add(2, new Customer17(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer17 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer17 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer17> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer17(201, "Della"));
        newCustomers.add(new Customer17(202, "Victor"));
        newCustomers.add(new Customer17(203, "Sarah"));

        customers. addAll(newCustomers);

        for (Customer17 cust : customers) {
            System. out.println(cust.toString());
        }

        System.out.println(customers);

        //Sort
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);
        System.out.println();

        //cara 2
        customers.sort((c1, c2)-> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }    
}
