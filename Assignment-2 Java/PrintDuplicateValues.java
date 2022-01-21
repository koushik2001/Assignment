
public class PrintDuplicateValues {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,7,8,8,9,9,10};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(i==j) {
					continue;
				}
				
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
