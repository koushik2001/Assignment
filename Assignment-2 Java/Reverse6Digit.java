
public class Reverse6Digit {

	public static void main(String[] args) {
		int number=123456;
		int reverse=0;
		while(number>0) {
			int temp=number%10;
			
			reverse=reverse*10+temp;
			number=number/10;
		}
		System.out.println(reverse);

	}

}
