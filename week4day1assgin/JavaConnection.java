package week4day1assgin;

public class JavaConnection extends MySqlConnection {

    
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }

    
    public void disconnect() {
        System.out.println("Disconnected from MySQL Database.");
    }

    
    public void executeUpdate() {
        System.out.println("Executing update query in MySQL Database.");
    }

    
    public void executeQuery() {
        System.out.println("Executing select query in MySQL Database.");
    }

    // Main method to execute the program
    public static void main(String[] args) {

        JavaConnection db = new JavaConnection();

        db.connect();
        db.executeQuery();
        db.executeUpdate();
        db.disconnect();
    }
}
