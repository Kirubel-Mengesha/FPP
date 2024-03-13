package Assignment6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing [EmployeeName=" + employeeName + ", ProductName=" + productName + ", SalesAmount=" + salesAmount + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Marketing marketing = (Marketing) obj;
        //return Double.compare(marketing.salesAmount, salesAmount) == 0 && employeeName.equals(marketing.employeeName) && productName.equals(marketing.productName);
        return salesAmount == marketing.getSalesAmount() && employeeName.equals(marketing.employeeName) && productName.equals(marketing.productName);
    }
}


