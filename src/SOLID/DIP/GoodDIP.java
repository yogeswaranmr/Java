package SOLID.DIP;

// 1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
// 2. Abstractions should not depend on details. Details should depend on abstractions.

import javax.xml.crypto.Data;

interface Database{
    public void save(String data);
}

class PostgresDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving "+data+" to Postgres DB...");
    }
}

class OracleDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving "+data+" to Oracle DB...");
    }
}

class GoodProjectService{
    // We depend on the ABSTRACTION, not the detail.
    private Database db;

    // The dependency is INJECTED from the outside.
    // We don't use 'new' here.
    public void setter(Database db){
        this.db = db;
    }

    public void saveProject(String data){
        db.save(data);
    }
}

public class GoodDIP {
    static void main() {
        String data1 = "AI DATA";
        String data2 = "BACKEND DATA";
        var postgresDbObj = new PostgresDatabase();
        var oracleDbObj = new OracleDatabase();

        // Here we use PostgresDB
        var goodProjectServiceObj1 = new GoodProjectService();
        goodProjectServiceObj1.setter(postgresDbObj);
        goodProjectServiceObj1.saveProject(data1);

        // Here we use OracleDB
        var goodProjectServiceObj2 = new GoodProjectService();
        goodProjectServiceObj2.setter(oracleDbObj);
        goodProjectServiceObj2.saveProject(data2);
    }
}
