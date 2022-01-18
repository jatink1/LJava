
public class leapYear {
	public static void main(String[] args) {
		int y = 1996;
		boolean leap = false;
		
		if(y%4==0) {
			
			if(y%100==0) {
				
				if(y%400==0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = false;
			}
		}
		else {
			leap = false;
		}
		
		if(leap) {
			System.out.println("The year is a leap year.");
		}
		else {
			System.out.println("The year is NOT a leap year.");
		}
	};
}
