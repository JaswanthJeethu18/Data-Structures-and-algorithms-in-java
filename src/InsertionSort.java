
public class InsertionSort {

	public static void main(String[] args) {
		 int[] intarray = {20,35,-15,7,55,1,-22};
		 
		 //loop to pick the first element in the unsorted list 
		 for(int firstUnsortedIndex=1;firstUnsortedIndex < intarray.length;
				 firstUnsortedIndex++) {
			 
			 //assigning the first unsorted element to the newElement variable 
			 int newElement = intarray[firstUnsortedIndex];
			 
			 //declaring outside the loop for later access 
			 int i;
			 
			 //loop to iterate and shift the element in the sorted list 
			 for( i=firstUnsortedIndex; i > 0 && intarray[i-1]>newElement ;i--  ) {
				 intarray[i] = intarray[i-1];
			 }
			 
			 /*after shifting the first element to the sorted list  
			  * the next element in the unsorted list must be assigned to the element 
			  * so that it can be compared in the sorted list again 
			  */
			 intarray[i] = newElement;
		 }
		 
		 for(int i=0; i < intarray.length;i++) {
			 System.out.println(intarray[i]);
		 }

	}

}
