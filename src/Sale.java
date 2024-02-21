class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
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

/*    public void displayInfo() {
        System.out.println("-------------------------------------");
        System.out.println("|           SALE INFORMATION        |");
        System.out.println("-------------------------------------");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("-------------------------------------");
        System.out.println("|           EXPENSE DETAILS         |");
        System.out.println("-------------------------------------");
        System.out.printf("Service Expense: $%.2f\n", serviceExpense, serviceExpense - (serviceExpense * customer.getServiceMemberDiscount()));
        System.out.printf("Product Expense: $%.2f\n", productExpense, productExpense - (productExpense * customer.getProductMemberDiscount()));
        System.out.println("-------------------------------------");
        System.out.println("|           TOTAL EXPENSE           |");
        System.out.println("-------------------------------------");
        System.out.printf("Total Service Expense: $%.2f\n", serviceExpense - (serviceExpense * customer.getServiceMemberDiscount()));
        System.out.printf("Total Product Expense: $%.2f\n", productExpense - (productExpense * customer.getProductMemberDiscount()));
        System.out.println("Total Expense: $" + getTotalExpense());
    }
}*/

    public void displayInfo() {
        double serviceDiscount = customer.getServiceMemberDiscount();
        double productDiscount = customer.getProductMemberDiscount();

        System.out.println("-------------------------------------");
        System.out.println("|           SALE INFORMATION        |");
        System.out.println("-------------------------------------");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("-------------------------------------");
        System.out.println("|           EXPENSE DETAILS         |");
        System.out.println("-------------------------------------");
        System.out.printf("Service Expense: $%.2f \n(Discount: %.2f%%)\n", serviceExpense, serviceDiscount * 100);
        System.out.printf("Product Expense: $%.2f \n(Discount: %.2f%%)\n", productExpense, productDiscount * 100);
        System.out.println("-------------------------------------");
        System.out.println("|           TOTAL EXPENSE           |");
        System.out.println("-------------------------------------");
        System.out.printf("Total Service Expense: $%.2f\n", serviceExpense - (serviceExpense * serviceDiscount));
        System.out.printf("Total Product Expense: $%.2f\n", productExpense - (productExpense * productDiscount));
        System.out.println("Total Expense: $" + getTotalExpense());
    }
}