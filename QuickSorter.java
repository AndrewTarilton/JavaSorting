/**
 * a child class of BasicSorter, this class implements a quick sort algorithm
 * @author Andy
 * @version 4/12/17
 */
public class QuickSorter extends BasicSorter{
	
	/**
	 * the public view for the calling of the shell sort algorithm. All it does is call the recursive overloaded method of itself with the whole array, from its first to its last element to be sorted
	 * @param array		the array to be sorted
	 */
	public <E extends Comparable<E>> void quickSort(E[] array){
		quickSort(array, 0, array.length-1);
	}
	
	/**
	 * the private, overloaded version of the sort, this is where most of the work of the algorithm is done. It calls a helper method to find the index of a partition or pivot point and order the array such that all elements to the left of it are smaller than the pivot and all elements greater are to the right, then it recurses on the subarrays to the left and right of the pivot, pivot not included
	 * @param array		the array to be sorted
	 * @param start		the starting index of the subarray to be sorted
	 * @param end		the ending index of the subarray to be sorted
	 */
	private <E extends Comparable<E>> void quickSort(E[] array, int start, int end){
		if(start < end){
			int iPartition = partitionPlus(array, start, end);	//find a pivot point and order the array around it
			
			quickSort(array, start, iPartition-1);		//recurse to the left of the pivot
			quickSort(array, iPartition+1, end);		//recurse to the right of the pivot
		}
		
	}
	
	/**
	 * a helper method for quicksort, this method looks at the subarray within array between indices start and end, picks a pivot(the index at the start position), and orders the array such that all elements to the left of the pivot are smaller than it, and all elements to the right of the pivot are larger
	 * @param array		the array to be sorted
	 * @param start		the starting index of the subarray to be sorted
	 * @param end		the ending index of the subarray to be sorted
	 * @return
	 */
	private <E extends Comparable<E>> int partition(E[] array, int start, int end){
		//initialize the pivot and pointers to the start and end positions
		E pivot = array[start];		
		int leftPtr = start;
		int rightPtr = end;
		
		do{
			while(leftPtr < end && pivot.compareTo(array[leftPtr]) >= 0){ //the left pointer increments from start to end or until it finds an element greater than pivot
				leftPtr++;
			}
			while(rightPtr > start && pivot.compareTo(array[rightPtr]) < 0){ //the right pointer increments from end to start or until it finds an element smaller than pivot
				rightPtr--;
			}
			if(leftPtr < rightPtr){	//if the two pointers stop and have not passed each other through the array, the elements found by the pointers are then swapped
				swap(array, leftPtr, rightPtr);
			}
		}while(leftPtr < rightPtr);		//this process only continues so long as the two pointers have not passed each other
		swap(array, start, rightPtr);	//finally, the start/pivot element is swapped with whichever one the right pointer is at, ensuring the property of the pivot is maintained
		return rightPtr;
	}
	
	/**
	 * a helper method for quicksort, this method looks at the subarray within array between indices start and end, picks a pivot using an improved algorithm, and orders the array such that all elements to the left of the pivot are smaller than it, and all elements to the right of the pivot are larger
	 * @param array		the array to be sorted
	 * @param start		the starting index of the subarray to be sorted
	 * @param end		the ending index of the subarray to be sorted
	 * @return
	 */
	private <E extends Comparable<E>> int partitionPlus(E[] array, int start, int end){
		
		int mid = (end-start)/2;
		
		//this block of if statements sorts the first, middle, and last elements in the array. Then it swaps the median value with that of the least (of the three) and first (of the array) value.
		//this ensures a more statistically optimal pivot point is chosen. The algorithm then resumes ordinarily according to the more basic partition method
		if(array[mid].compareTo(array[start]) < 0){
			abstractSorter.swap(array, mid, start);
		}
		if(array[mid].compareTo(array[end]) > 0){
			abstractSorter.swap(array, mid, end);
		}
		if(array[start].compareTo(array[mid]) > 0){
			abstractSorter.swap(array, start, mid);
		}
		abstractSorter.swap(array, start, mid);
		
		//initialize the pivot and pointers to the start and end positions
		E pivot = array[start];		
		int leftPtr = start;
		int rightPtr = end;
		
		do{
			while(leftPtr < end && pivot.compareTo(array[leftPtr]) >= 0){ //the left pointer increments from start to end or until it finds an element greater than pivot
				leftPtr++;
			}
			while(rightPtr > start && pivot.compareTo(array[rightPtr]) < 0){ //the right pointer increments from end to start or until it finds an element smaller than pivot
				rightPtr--;
			}
			if(leftPtr < rightPtr){	//if the two pointers stop and have not passed each other through the array, the elements found by the pointers are then swapped
				swap(array, leftPtr, rightPtr);
			}
		}while(leftPtr < rightPtr);		//this process only continues so long as the two pointers have not passed each other
		swap(array, start, rightPtr);	//finally, the start/pivot element is swapped with whichever one the right pointer is at, ensuring the property of the pivot is maintained
		return rightPtr;
	}
}
