package SOLID.SRP;

// "A class should have one, and only one, reason to change."

class BadInvoice{
    private double amount;
    private double taxRate;

    public BadInvoice(double amount, double taxRate){
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public double calculateTotal(){
        return amount + (amount * taxRate);
    }

    public void printInvoice(){
        System.out.println("Invoice Total: $" + calculateTotal());
    }

    public void saveToFile(){
        System.out.println("Saving invoice to invoice.txt...");
    }
}

public class BadSRP {
    static void main() {
        var badInvoiceObj = new BadInvoice(1000, 0.5);
        System.out.println(badInvoiceObj.calculateTotal());
        badInvoiceObj.printInvoice();
        badInvoiceObj.saveToFile();
    }
}
