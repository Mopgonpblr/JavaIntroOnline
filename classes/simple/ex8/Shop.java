package classes.simple.ex8;

public class Shop {

    private Customer[] customers;

    Shop(Customer[] customers) {
        this.customers = customers;
    }

    public void sortPrint() {
        System.out.println("Sorting by surname");

        for (int i = 1; i < customers.length; ) {
            if (customers[i - 1].getSurname().compareTo(customers[i].getSurname()) > 0) {
                Customer temp = customers[i - 1];
                customers[i - 1] = customers[i];
                customers[i] = temp;
                i = 1;
            } else
                i++;
        }
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());
    }

    public void printRange(long min, long max) {
        System.out.println("Cards in range between " + min + " and " + max);
        for (Customer customer : customers) {
            if (customer.getCardNumber() > min && customer.getCardNumber() < max)
                System.out.println(customer);
        }
    }
}
