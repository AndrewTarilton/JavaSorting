/**
 * a child class extending the BasicSorter in order to build on BasicSorter, this class implements the heap sort
 * it doesn't necessarily need to extend the BasicSorter, except to use methods from abstractSorter, but is a very minor demonstration of how classes can be extended from one another
 * @author Andy
 * @version 4/8/17
 */
public class HeapSorter extends BasicSorter{
	
	/**
	 * sorts the given array using the heap sort algorithm
	 * first, it structures the array into a heap, then it sorts the array in-place by removing an element from the "heap" and restoring the heap property, one at a time
	 * @param array		the array to be sorted
	 */
	public <E extends Comparable<E>> void heapSort(E[] array){
		
		heapify(array);
		
		int tail = array.length - 1;	//the pointer to the "end" of the heap/unsorted array
		
		while(tail > 0){	//starting from the end of the array and working to the front
			abstractSorter.swap(array, 0, tail);	//swap the top of the heap with the last element in the array
			tail--;			
			restore(array, 0, tail);	//restore the heap property across all indices not utilized by the sorted array
		}
	}
	
	/**
	 * restores the heap property in a given array between the start and end points
	 * @param array		the to be restored
	 * @param start		the start point in the array where it begins to need to be restored (inclusive)
	 * @param end		the end point in the array where it no longer needs to be restored (inclusive)
	 */
	private <E extends Comparable<E>> void restore(E[] array, int start, int end){
		
		int ptr = start;
		
		while(leftChild(ptr) <= end){	//while the ptr indice still has children
			int child = (2 * ptr) + 1;		//the indice of ptr's left child
			int toSwap = ptr;				//beginning the first loop with ptr as the parent indice
			if(array[toSwap].compareTo(array[child]) < 0){	
				toSwap = child;
			}
			if((child+1) <= end && array[toSwap].compareTo(array[child+1]) < 0){	//if the right child exists and is larger than toSwap
				toSwap = child + 1;
			}
			if(toSwap == ptr){	//if this boolean is met, it means that the heap property has been met on this iteration of the while loop, and so we can exit
				break;
			}
			else{
				swap(array, ptr, toSwap);	//if the boolean isn't, there's more work to be done, and toSwap is finally swapped with the ptr value and ptr reset to toSwap, representing a parent/child swap
				ptr = toSwap;
			}
		}
	}
	
	/**
	 * builds the array into a heap
	 * @param array		the array to be build into a heap
	 */
	private <E extends Comparable<E>> void heapify(E[] array){
		if(array.length > 0){
			int n = 1;
			while( n < array.length){	//for each value in the array
				n++;
				
				int child = n-1;
				int parent = (child-1)/2;
				while(parent >= 0 && array[parent].compareTo(array[child]) < 0){	//if the heap property isn't observed between the parent and child, swap them and readjust parent/child values until it is
					abstractSorter.swap(array, parent, child);
					child = parent;
					parent = (child-1)/2;
				}
			}
		}
	}
	
	/**
	 * helper method used to quickly calculate the index of a given indice's left child
	 * @param index		the index value of the "parent" element
	 * @return			the index value of the "parent's" left child
	 */
	private int leftChild(int index){
		return (2*index) +1;
	}
	
}
