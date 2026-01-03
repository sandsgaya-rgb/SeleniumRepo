package week4day1assgin;

public class Connection implements DatabaseConnection 
{

    public void connect()
    {
        System.out.println("Database connected successfully.");
    }

   
    public void disconnect()
    {
        System.out.println("Database disconnected successfully.");
    }

       public void executeUpdate() {
        System.out.println("Update query executed successfully.");
    }

    public static void main(String[] args) {

        // Create object of Concrete class
        DatabaseConnection db = new Connection();

        // Call interface methods
        db.connect();
        db.executeUpdate();
        db.disconnect();
    }
}
