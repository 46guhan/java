import java.sql.*;

public class BatchExample {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            stmt.addBatch("insert into student values(101,'Ram')");
            stmt.addBatch("insert into student values(102,'Sam')");
            stmt.addBatch("insert into student values(103,'Tom')");

            stmt.executeBatch();

            System.out.println("Batch Insert Successful");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}