import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "password"
            );

            // Start Transaction
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            // Withdraw from Account A
            stmt.executeUpdate(
                "update account set balance = balance - 500 where id = 1"
            );

            // Deposit to Account B
            stmt.executeUpdate(
                "update account set balance = balance + 500 where id = 2"
            );

            // Commit Transaction
            con.commit();

            System.out.println("Transaction Successful");

        } catch(Exception e) {
            try {
                con.rollback(); // Undo changes
                System.out.println("Transaction Failed");
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}