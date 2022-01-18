
public class relationalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//relational operator
		if (a>b) {
			System.out.println(" a is greater than b");
		}else {System.out.println("b is greater than a");}
		
		//Bitwise and
		System.out.println("a & b = " + (a & b));
		
		//ternary operator
        String s = (a>b) ? "a is greater than b" : "b is greater than a";
		System.out.println(s);
	}

}
