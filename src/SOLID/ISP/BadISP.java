package SOLID.ISP;

// "Clients should not be forced to depend upon interfaces that they do not use."
// "If the (SRP) is about classes having only one job, the (ISP) is about interfaces having only one job."

interface IMachine{
    void print();
    void fax();
    void scan();
}

class BadSmartCopier implements IMachine{
    public void print() { System.out.println("Printing in color..."); }
    public void fax() { System.out.println("Sending in fax..."); }
    public void scan() { System.out.println("Scanning high-res document..."); }
}

// Trying to implement IMachine for a basic printer which only prints...
class BadBasicPrinter implements IMachine{
    public void print() { System.out.println("Printing in black and white..."); }
    // We are FORCED to implement these, even though the printer can't do them!
    public void fax() { throw new UnsupportedOperationException("Cannot Fax!"); }
    public void scan() { throw new UnsupportedOperationException("Cannot Scan!"); }
}

public class BadISP {
    static void main() {
    }
}
