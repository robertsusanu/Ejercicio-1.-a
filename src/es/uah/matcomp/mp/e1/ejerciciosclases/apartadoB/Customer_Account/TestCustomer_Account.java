package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.Customer_Account;

public class TestCustomer_Account {
    public static void main(String[] args) {
        //Test Costumer class
        Customer c1 = new Customer(100, "Julian", 'm');
        Customer c2 = new Customer(200, "Maria", 'h');

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        //Test Account class
        Account cnta1 = new Account(100, c1, 200.50);
        Account cnta2 = new Account(100, c2);

        System.out.println(cnta1);
        System.out.println(cnta2);

        //Test get
        System.out.println("id is: " + cnta1.getId());
        System.out.println("customer is: " + cnta1.getCustomer());
        System.out.println("balance is: " + cnta1.getBalance());
        System.out.println("name's Costumer is:" + cnta1.getCustomerName());

        //Test set
        cnta2.setBalance(300);
        System.out.println(cnta2);

        //deposit and withdraw
        cnta2.deposit(100);
        System.out.println(cnta2);
        cnta2.withdraw(450);
        cnta2.withdraw(300);
        System.out.println(cnta2);
    }
}
