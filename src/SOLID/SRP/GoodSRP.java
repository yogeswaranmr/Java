package SOLID.SRP;

// "A class should have one, and only one, reason to change."

class GoodInvoice{
    private double amount;
    private double taxRate;

    public GoodInvoice(double amount, double taxRate){
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public double calculateTotal(){
        return amount + (amount * taxRate);
    }
}

class InvoicePrinter{
    public void print(GoodInvoice goodInvoice){
        System.out.println("Invoice Total: $" + goodInvoice.calculateTotal());
    }
}

class InvoiceRepository{
    public void save(GoodInvoice goodInvoice){
        System.out.println("Saving Invoice to invoice.txt...");
    }
}

public class GoodSRP {
    static void main() {
        var goodInvoiceObj = new GoodInvoice(1000, 0.5);
        System.out.println(goodInvoiceObj.calculateTotal());

        var invoicePrinterObj = new InvoicePrinter();
        invoicePrinterObj.print(goodInvoiceObj);

        var invoiceRepositoryObj = new InvoiceRepository();
        invoiceRepositoryObj.save(goodInvoiceObj);
    }
}
