package week3.day2;

// Subclass
public class LoginTestData extends TestData {

    public void enterUsername() {
        System.out.println("Entering Username");
    }

    public void enterPassword() {
        System.out.println("Entering Password");
    }

    public static void main(String[] args) {

        // Create object of subclass
        LoginTestData login = new LoginTestData();

        // Call superclass methods
        login.enterCredentials();
        login.navigateToHomePage();

        // Call subclass methods
        login.enterUsername();
        login.enterPassword();
    }
}

