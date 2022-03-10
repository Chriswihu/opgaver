package Task3;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args)
    {
        Customer cus1 = new Customer("Chris", "William", "WillIChris!", 23);
        Customer cus2 = new Customer("John", "Bjoern", "B-John", 53);
        Customer cus3 = new Customer("Cami", "Dean", "CamiDEAN", 37);
        Customer cus4 = new Customer("Oliver", "Worthy", "Worth-OLI!", 95);
        Customer cus5 = new Customer("Fredrick", "Carlson", "CarlVonFredrick!", 126);
        Customer cus6 = new Customer("Katty", "Perry", "Singer-Perry", 284);

        customers.add(cus1);
        customers.add(cus2);
        customers.add(cus3);
        customers.add(cus4);
        customers.add(cus5);
        customers.add(cus6);

        printCustomer();
    }
    public static void printCustomer()
    {
        for (Customer c:customers
             ) {
            System.out.println(c);
        }
    }





}
