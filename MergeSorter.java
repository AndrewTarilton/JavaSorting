/**
 * A child class of BasicSorter, this implements a merge sort using a buffer array half the size of the input array.
 * It builds on BasicSorter and, by extension, abstractSorter to share some basic functionality built into abstractSorter
 * @author Andy
 * @version 4/9/17
 *
 */
public class MergeSorter extends BasicSorter{

	/**
	 * the public call to sort the given array, it only requires the array to be sorted
	 * @param array		the array to be sorted
	 */
	public <E extends Comparable<E>> void mergeSort(E[] array){
		E[] buffer = (E[]) new Comparable[array.length/2];		//Java can't instantiate an array of generic data types, so one is made using an array of Comparable objects instead, and then cast into a generic data type
		mergeSort(array, 0, array.length, buffer);
	}

	/**
	 * the private and true sorting algorithm, this is called recursively on "subarrays" between the start to midpoint, and midpoint to end indices
	 * The buffer array contains unsorted elements from the left half of the array; the left half of the array is treated as the final, sorted array while the right half of the array and the buffer array are used as the "right" and "left" (respectively) arrays in a merge function
	 * @param array		the original array and the one to be sorted
	 * @param start		the start index
	 * @param end		the end index 
	 * @param buffer	the buffer array
	 */
	private <E extends Comparable<E>> void mergeSort(E[] array, int start, int end, E[] buffer){
		if(end - start <= 1) return;	//the base case occurs where the length of the "subarray" between start and end is equal to or less than 1

		int iMid = (start + end)/2;		//find the midpoint between start and end
		//recurse on the left and right "subarrays"
		mergeSort(array, start, iMid, buffer);
		mergeSort(array, iMid, end, buffer);

		//copy the left half of array into buffer
		System.arraycopy(array, start, buffer, 0, iMid-start);
		
		int iBuffer = 0;	//a pointer to the current location in the iteration through buffer
		int iArray = iMid;	//a pointer to the current location in the iteration through array, it begins at the midpoint because we sort through the right half of the "subarray"
		int sortPtr = start;	//a pointer to the current location in the iteration through array, it begins at start because that is the yet-unsorted left half of the "subarray"


		//a nearly-standard merge algorithm common to mergesort, modified to work with the virtual subarrays between mid and end points of array and for the first iMid-start elements of the buffer, the length of this recursive call's virtual subarrays
		while(iArray < end && iBuffer < (iMid-start)){		
			if(array[iArray].compareTo(buffer[iBuffer]) < 0){
				array[sortPtr++] = array[iArray++];
			}
			else{
				array[sortPtr++] = buffer[iBuffer++];
			}
		}
		while(iArray < end){
			array[sortPtr++] = array[iArray++];
		}
		while(iBuffer < iMid-start){
			array[sortPtr++] = buffer[iBuffer++];
		}
	}
}


