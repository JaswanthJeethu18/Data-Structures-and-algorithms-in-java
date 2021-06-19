public class BubbleSort {

	public static void main(String[] args) {
		int[] input_array = { 2 , 15 , 6 , 8 , 11 , -1 , -3 };
        for(int lastunsortedelement = input_array.length-1; lastunsortedelement > 0 ; lastunsortedelement--) {
        	for(int i=0;i < lastunsortedelement;i++ ) {
        		if(input_array[i] > input_array[i+1]) {
        			swap(input_array,i,i+1);
        		}
        	}
        }
        for(int i=0;i<input_array.length;i++) {
        System.out.println(input_array[i]);
        }
	}
	public static void swap(int[] input, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = input[i];
		input[i]= input[j];
		input[j]= temp;
		
	}

}

