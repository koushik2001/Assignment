
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int lo = 0;
		int hi = arr.length-1;
		
		int x = 3;
		
		 while (lo < hi) {
			 int mid = (lo + hi) / 2;
		     
			 if(arr[mid]==x) {
				 System.out.println(mid);
				 return ;
			 }
			 
			 if(arr[mid]<x) {
				 lo = mid + 1;
			 }
			 
			 else {
				 hi  = mid-1;
			 }
		 }
		 
		 System.out.println(-1);

	}

}
