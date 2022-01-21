
public class SortArray {

	public static void main(String[] args) {
		int arr[]= {23,2,11,4,5,6,49,8,92,100};
		
		int n = arr.length;
        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
        		if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        	}
                
        }
        
        for(int ele:arr) {
        	System.out.print(ele+" ");
        }
            

	}

}
