/**
 * A child class extending abstractSorter, this class implements a selection sort
 * 
 * @author Andy
 * @version 3/14/17
 *
 */
public class SelectionSorter extends abstractSorter {

	/**
	 * constructor for a SelectionSorter object
	 * @param size		the size of the array this object will generate
	 */
	public SelectionSorter(int size){
		this.size = size;
	}

	/**
	 * A method to sort a given array in ascending order, accomplished using the selection sort algorithm
	 * @param array		The array to be sorted
	 */
	public <E extends Comparable<E>> void sort(E[] array) {
		if(array == null){
			throw new IllegalArgumentException("Array is null in SelectionSorter.sort");
		}
		int min;
		for(int i = 0; i < size; i++){
			min = i;
			for(int j = i; j < size; j++){
				if(array[min].compareTo(array[j]) > 0){
					min = j;
				}
			}
			swap(array, i, min);
		}

	}

}
