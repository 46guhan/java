import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicMySQLQueries {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sample";   // change DB name
        String user = "root";
        String password = "livewire";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            System.out.println("✅ Connected to MySQL");

            // CREATE TABLE
            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student(" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50))"
            );
            System.out.println("✅ Table Ready");

            // INSERT
            st.executeUpdate("INSERT INTO student VALUES(1,'Guhan')");
            st.executeUpdate("INSERT INTO student VALUES(2,'Kumar')");
            System.out.println("✅ Data Inserted");

            // SELECT
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("📋 Student Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("name"));
            }

            // UPDATE
            st.executeUpdate("UPDATE student SET name='Arun' WHERE id=2");
            System.out.println("✅ Data Updated");

            // DELETE
            st.executeUpdate("DELETE FROM student WHERE id=1");
            System.out.println("✅ Data Deleted");

            con.close();
            System.out.println("🔒 Connection Closed");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}