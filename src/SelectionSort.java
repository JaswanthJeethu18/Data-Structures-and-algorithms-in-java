
public class SelectionSort {
	
	public static void main(String [] args) {
		int[] array = {2, 30, -5, 12, -4, 35}; 
		
		
		for(int lastunsortedindex = array.length-1;lastunsortedindex >0;
				lastunsortedindex--) {
			 int largest = 0 ;
			 
			 for(int i = 1 ; i <= lastunsortedindex;i++) {
				 if(array[i] > array[largest]) {
					 largest=i;
				 }
			 }
			 
			 swap(array, largest, lastunsortedindex);
		}
		
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}
	}
	
	public static void swap(int[] input, int i, int j) {
		if( i == j) {
			return;
		}
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
