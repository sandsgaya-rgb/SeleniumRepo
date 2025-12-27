package week3.day1;

	public class Palindrome {

	    public static void main(String[] args) {

	        String str1 = "LALALAL";
	        String str2 = "";

	        for (int i = str1.length() - 1; i >= 0; i--) {
	            str2 = str2 + str1.charAt(i);
	        }

	        System.out.println(str2);

	        if (str1.equals(str2)) {
	            System.out.println("string is a palindrome");
	        } else {
	            System.out.println("string is not palindrome");
	        }
	    }
	}



