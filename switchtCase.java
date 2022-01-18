
public class switchtCase {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		String  op = "Multiply";
		
		switch (op) {
		case "Add":
			System.out.println("Sum is " + (a+b) );
			break;
			
		case "Subtract":
			System.out.println("Difference is " + (a-b) );
			break;
			
		case "Multiply":
			System.out.println("Product is " + (a*b) );
			break;
			
		default:
			System.out.println("Invalid Option");
		}
	}
}
