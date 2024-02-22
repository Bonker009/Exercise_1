public class Sale {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;
    private String date;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense() {
        double totalServiceExpense = serviceExpense - (serviceExpense * customer.getServiceMemberDiscount());
        double totalProductExpense = productExpense - (productExpense * customer.getProductMemberDiscount());
        return totalServiceExpense + totalProductExpense;
    }



    public String displayInfo() {
        return "Sale Information: \n" +
                "========================================================================"+"\n"+
                "Customer: " + customer.getCustomerName() + "\n" +
                "Date: " + date + "\n" +
                "Service Expense: $" + serviceExpense + "\n" +
                "Discount on Service: " + (customer.getServiceMemberDiscount() * 100) + "%\n" +
                "Product Expense: $" + productExpense + "\n" +
                "Discount on Product: " + (customer.getProductMemberDiscount() * 100) + "%\n" +
                "Total Expense: $" + getTotalExpense() + "\n"+
                "========================================================================"+"\n";
    }

}
