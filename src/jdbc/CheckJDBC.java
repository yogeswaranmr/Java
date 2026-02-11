package jdbc;

public class CheckJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("✅ SUCCESS: PostgreSQL Driver found!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ ERROR: Driver NOT found. You need to add the JAR.");
        }
    }
}
