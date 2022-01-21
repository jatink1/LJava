/* 
 * 1.WAP to print all the values of an array
 * 2.WAP to print elements of array in reverse order
 * 3.WAP to print duplicate values in an array
 * 4.WAP to sort the array
 * 5.WAP to reverse a 6 digit number (123456)---à(654321)
 * */
public class questions_21_Jan {
	public static void q1(){
		System.out.println("---- ");
		System.out.println("to print all the values of an array");
		
		int arr[] = {1,2,3,4,5};
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void q2() {
		System.out.println("---- ");
		System.out.println("to print elements of array in reverse order");
		int arr2[] = {1,2,3,4,5};
		for (int i=(arr2.length-1);i>=0;i--) {
			System.out.println(arr2[i]);
		}
	}
	
	public static void q3() {
		System.out.println("---- ");
		System.out.println("to print duplicate values in an array");
		int arr3[] = {1,1,2,3,4,4,5,6,7,7,8,9,10};
		for (int i=0;i<arr3.length ;i++) {
			for (int j=0;j<arr3.length;j++) {
				if(arr3[i]==arr3[j] && i!=j) {
					System.out.println(arr3[i]);
				}
			}
		}
	}
	
	public static void q4() {
		System.out.println("---- ");
		System.out.println("to sort the array");
		int arr4[] = {5,4,1,25,8,874,1,3,6};
		for(int i = 0; i < arr4.length ; i++)
        {
            for(int j = 0 ; j < arr4.length ; j++)
            {
                if(arr4[i] < arr4[j])
                {
                    int temp; 
                    temp = arr4[i];
                    arr4[i] = arr4[j];
                    arr4[j] = temp;
                }
            }
        }
		for (int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println(" ");
		
	}
	
public static void q5() {
	System.out.println("---- ");
	System.out.println("to reverse a 6 digit number (123456)---à(654321)");
	int n = 123456; 
    int r= 0  ; 
    while(n != 0)
    {
        int m = n % 10 ; 
        n = n/10 ;
        r = r * 10 + m; 
    }
    System.out.println( r) ; 
}
	
	public static void main(String[] args) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

}
