package ch04;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {//다형성2
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer(1, "kim");
        Customer customer2 = new Customer(2, "lee");
        Customer customer3 = new GoldCustomer(3, "park");
        Customer customer4 = new GoldCustomer(4, "jun");
        Customer customer5 = new VIPCustomer(5, "hong");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customerList) {
            int result = customer.calPrice(price);

            System.out.println(result);
        }
    }

}
