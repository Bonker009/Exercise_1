public class Customer implements DiscountRate{
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        return switch (this.customerType) {
            case "Premium" -> 0.20;
            case "Gold" -> 0.15;
            case "Silver" -> 0.10;
            default -> 0.0;
        };
    }

    @Override
    public double getProductMemberDiscount() {
        return switch (this.customerType) {
            case "Premium", "Silver", "Gold" -> 0.10;
            default -> 0.0;
        };
    }
}
