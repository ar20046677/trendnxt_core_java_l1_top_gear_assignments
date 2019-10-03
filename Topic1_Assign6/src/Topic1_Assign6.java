// find greatest number in array
// assume array is not sorted

public class Topic1_Assign6 {

	public static void main(String[] args) {
		int[] arr = new int[]{230,5,4,76,100,5};
		int largeNum = 0;
		
		for(int i =0; i< arr.length; i++){
			if (arr[i]>largeNum){
				largeNum = arr[i];
			}
		}
		
		System.out.println("Largest Number in array: " + largeNum);

	}

}
