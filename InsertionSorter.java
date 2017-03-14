/**
 * A child class extending abstractSorter, this class implements an insertion sort
 *
 * @author Andy
 * @version 3/14/17
 *
 */
public class InsertionSorter extends abstractSorter {

	/**
	 * constructor for a InsertionSorter object
	 * @param size		the size of the array this object will generate
	 */
	public InsertionSorter(int size){
		this.size = size;
	}
	
	/**
	 * A method to sort a given array in ascending order, accomplished using the insertion sort algorithm
	 * @param array		The array to be sorted
	 */
	public <E extends Comparable<E>> void sort(E[] array) {
		if(array == null){
			throw new IllegalArgumentException("Array is null in InsertionSorter.sort");
		}
		
		int ptr;
		for(int i = 1; i < size; i++){
			ptr = i;
			while(ptr > 0 && array[ptr-1].compareTo(array[ptr]) > 0){
				swap(array, ptr-1, ptr);
				ptr--;
			}
		}
	}

}
