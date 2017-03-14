/**
 * A child class extending abstractSorter, this class implements a bubble sort
 *
 * @author Andy
 * @version 3/14/17
 *
 */
public class BubbleSorter extends abstractSorter{

	/**
	 * constructor for a BubbleSorter object
	 * @param size		the size of the array this object will generate
	 */
	public BubbleSorter(int size){
		this.size = size;
	}

	/**
	 * A method to sort a given array in ascending order, accomplished using the bubble sort algorithm
	 * @param array		The array to be sorted
	 */
	public <E extends Comparable<E>> void sort(E[] array){
		if(array == null ){
			throw new IllegalArgumentException("Array is null in BubbleSorter.sort");
		}
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(int i = 1; i < size; i++){
				if(array[i-1].compareTo(array[i]) > 0){
					swap(array, i-1, i);

					swapped = true;
				}
			}	
		}
	}


}