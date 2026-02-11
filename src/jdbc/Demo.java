package jdbc;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        // --- CONFIG ---
        String url = "jdbc:postgresql://localhost:5432/code_platform";
        String user = "postgres";
        String password = "YOUR_PASSWORD"; // <--- UPDATE THIS!

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // ==========================================
            // PART A: SAVE A NEW PROBLEM
            // ==========================================
            System.out.println("--- Saving a new problem ---");

            String insertSql = "INSERT INTO problems (title, description, difficulty) VALUES (?, ?, ?)";
            PreparedStatement saveStmt = conn.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);

            // Create a problem object
            Problem myProblem = new Problem("Two Sum", "Find two numbers that add up to target", "Easy");

            // Fill the blanks
            saveStmt.setString(1, myProblem.getTitle());
            saveStmt.setString(2, myProblem.getDescription());
            saveStmt.setString(3, myProblem.getDifficulty());

            saveStmt.executeUpdate();
            System.out.println("✅ Saved: " + myProblem.getTitle());

            // ==========================================
            // PART B: FETCH IT BACK
            // ==========================================
            System.out.println("\n--- Reading from Database ---");

            String selectSql = "SELECT * FROM problems";
            PreparedStatement readStmt = conn.prepareStatement(selectSql);
            ResultSet rs = readStmt.executeQuery();

            while (rs.next()) {
                // Convert SQL row -> Java Object
                Problem p = new Problem(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("difficulty")
                );
                System.out.println("Found: " + p.toString());
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}