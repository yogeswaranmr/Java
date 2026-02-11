package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {

        // 1. Connection Details
        String url = "jdbc:postgresql://localhost:5432/PracticeDB";
        String user = "postgres";
        String password = "5432";

        try {
            // 2. Loading Driver
            Class.forName("org.postgresql.Driver");

            // 3. Connecting to the DB
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to Database!");

            // 4. Create the SQL Command (The "Form")
            String sql = "INSERT INTO practice (name, age) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // 5. Filling the blanks (The '?' marks)
            String name = "candice";
            int age = 20;
            stmt.setString(1, name);  // First ? becomes "Alice"
            stmt.setInt(2, age);          // Second ? becomes 22

            // 6. Execute
            int rows = stmt.executeUpdate();
            System.out.println("🎉 Success! Inserted \"" + name + "\" and \"" + age + "\" into 'practice'.");

            // 7. Closing Connection
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: JDBC Driver JAR is missing!");
        } catch (SQLException e) {
            System.out.println("❌ Database Error:");
            e.printStackTrace();
        }
    }
}