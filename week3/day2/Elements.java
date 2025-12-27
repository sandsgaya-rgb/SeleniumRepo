package week3.day2;

public class Elements {

    public static void main(String[] args) {

        // Button object
        Button btn = new Button();
        btn.click();
        btn.submit();

        System.out.println("---------");

        // TextField object
        TextField text = new TextField();
        text.click();
        text.setText("Hello Java");
        text.getText();

        System.out.println("---------");

        // CheckBoxButton object
        CheckBox checkBox = new CheckBox();
        checkBox.click();
        checkBox.submit();
        checkBox.clickCheckButton();

        System.out.println("---------");

        // RadioButton object
        RadioButton radio = new RadioButton();
        radio.click();
        radio.submit();
        radio.selectRadioButton();
    }
}
