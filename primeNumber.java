
public class primeNumber {
	public static void main(String[] args) {
		int num = 31;
		boolean p = false;
		
		for(int i = 2; i<=num/2; ++i) {
			if(num%i==0) {
				p = true;
				break;
			}
		}
		
		if(!p) {
			System.out.println("Given number is a prime number.");
		}
		else {
			System.out.println("Given number is not a prime number.");
		}
		
	}
}
