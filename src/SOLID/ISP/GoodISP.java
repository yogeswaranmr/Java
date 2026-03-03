package SOLID.ISP;

// "Clients should not be forced to depend upon interfaces that they do not use."
// "If the (SRP) is about classes having only one job, the (ISP) is about interfaces having only one job."

interface IPrint{
    void print();
}

interface IFax{
    void fax();
}

interface IScan{
    void scan();
}

class GoodSmartCopier implements IPrint, IFax, IScan{
    public void print() { System.out.println("Printing in color..."); }
    public void fax() { System.out.println("Sending fax..."); }
    public void scan() { System.out.println("Scanning high-res document"); }
}

class GoodBasicPrinter implements IPrint{
    public void print() { System.out.println("Printing in black and white"); }
}

public class GoodISP {
    static void main() {
    }
}
