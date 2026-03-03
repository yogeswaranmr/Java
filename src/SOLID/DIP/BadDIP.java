package SOLID.DIP;

// 1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
// 2. Abstractions should not depend on details. Details should depend on abstractions.

// Low-level module
class MySQLDatabase{
    public void save(String data){
        System.out.println("Saving "+data+" to MySQL DB...");
    }
}

// High-level module
class BadProjectService{
    // TIGHT COUPLING: The service is glued to a specific database implementation.
    private MySQLDatabase db;

    public void setter(MySQLDatabase db){
        // The 'new' keyword here ruins the architecture.
        this.db = db;
    }

    public void saveProject(String data){
        db.save(data);
    }
}

public class BadDIP {
    static void main() {
        String data = "DATA";
        var mySqlDbObj = new MySQLDatabase();
        var badProjectServiceObj = new BadProjectService();

        badProjectServiceObj.setter(mySqlDbObj);
        badProjectServiceObj.saveProject("DATA");
    }
}