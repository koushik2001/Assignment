
public class Assignment {
	
	static boolean IsPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static boolean IsLeapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	static int Sum(int k) {
		return ((k)*(k+1)/2);
	}

	public static void main(String[] args) {
		
		// code for implementing operators
		
		int a = 10;
		int b = 2;
		int c = 20;
				
		//unary operator
				
		System.out.println(++a);
				
		//Arithematic operator
				
		System.out.println(a+b);
				
		//Left shift operator
				
		System.out.println(a<<b);
				
		//right shift operator
				
		System.out.println(a>>b);
				
		// Logical && Logical ||
				
		System.out.println(a<b&&a<c);
		System.out.println(a<b || a<c);		
		
		
		// code for finding out prime number
		
		if(IsPrime(11)) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
		// code for leap year or not
		
		if(IsLeapYear(1900)) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		
		
		// sum of first n numbers
		
		System.out.println(Sum(10));
		
		
		//code for implementing switch statment
		
		String select =  "c";
		
		switch(select) {
		
		case "a":
			System.out.println("letter is a");
			break;
		case "b":
			System.out.println("letter is b");
			break;
		default:
			System.out.println("letter not available");
		}
		

	}

}
