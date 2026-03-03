package SOLID.OCP;

// "Software entities should be open for extension, but closed for modification."

interface DiscountStrategy{
    double applyDiscount(double amount);
}

class NewCustomer implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.5;
    }
}

class Festival implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}

class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return 0;
    }
}

class DiscountFactory{
    public static DiscountStrategy getDiscountStrategy(String type){
        return switch(type){
            case "new_customer" -> new NewCustomer();
            case "festival" -> new Festival();
            default -> new NoDiscount();
        };
    }
}

public class GoodOCP {
    static void main() {
        double amount = 1000;
        String type = "festival";
        var promo = DiscountFactory.getDiscountStrategy(type);
        double discountAmount = promo.applyDiscount(amount);
        double finalAmount = amount - discountAmount;
        System.out.println("Discount for "+type+" : "+finalAmount);
    }
}
