package week4day1assgin;

public abstract class MySqlConnection implements DatabaseConnection
{

    // Abstract method specific to MySQL
    public abstract void executeQuery();
}