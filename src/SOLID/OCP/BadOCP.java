package SOLID.OCP;

// "Software entities should be open for extension, but closed for modification."

class BadDiscountCalculator{
    public double calculateDiscount(String type, double amount){
        if (type.equals("new_customer")){
            return amount * 0.5;
        } else if (type.equals("festival")){
            return amount * 0.2;
        } else {
            return 0;
        }
        // now if we want to add a new type, say vip_customer, we need to 'modify' the class by adding an 'else if'
        // for 500 new types, we need to write 1000 lines modification
    }
}

public class BadOCP {
    static void main() {
        var badDiscountCalculatorObj = new BadDiscountCalculator();
        double amount = 1000;
        String type = "new_customer";
        double discountAmount = badDiscountCalculatorObj.calculateDiscount(type, amount);
        double finalAmount = amount - discountAmount;
        System.out.println("Discount for "+type+" : "+finalAmount);
    }
}
