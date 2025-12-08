package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		
		boolean isPrime=true;
		
		for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

          if (isPrime && n > 1) 
          {
            System.out.println(n + " is a PRIME number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }


	}


