public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Penh Seyha","Premium");
        Customer customer1 = new Customer("Rany Virakvuth","Gold");
        Customer customer2 = new Customer("Vannty","Silver");
        Customer customer3 = new Customer("John","Normal");

        Sale sale = new Sale(customer,"2023-01-12");
        sale.setProductExpense(100);
        sale.setServiceExpense(100);
        System.out.println(sale.displayInfo());

        Sale sale1 = new Sale(customer1,"2023-02-25");
        sale1.setProductExpense(300);
        sale1.setServiceExpense(100);
        System.out.println(sale1.displayInfo());

        Sale sale2 = new Sale(customer2,"2023-09-30");
        sale2.setProductExpense(400);
        sale2.setServiceExpense(300);
        System.out.println(sale2.displayInfo());

        Sale sale3 = new Sale(customer3,"2023-011-17");
        sale3.setProductExpense(1000);
        sale3.setServiceExpense(974);
        System.out.println(sale3.displayInfo());
    }
}