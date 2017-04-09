/**
 * forms an abstract superclass for all sorting algorithms
 * leaves the sort method to be implemented by specific sorting child classes
 * The sort and the isSorted methods can use any data type as long as the data type can be compared through Comparable
 * The generateArray and printArray methods specifically use Integers for testing purposes
 * 
 * @author Andrew Tarilton
 * @version 4/1/17
 *
 */

public abstract class  abstractSorter {
	

	/**
	 * This is the bubble sort, to be implemented by children classes
	 * @param array 	the array to be sorted. Utilizes generic data types
	 */
	abstract public <E extends Comparable<E>> void bubbleSort(E[] array);
	
	/**
	 * This is the insertion sort, to be implemented by children classes
	 * @param array 	the array to be sorted. Utilizes generic data types
	 */
	abstract public <E extends Comparable<E>> void insertionSort(E[] array);
	
	/**
	 * This is the selection sort, to be implemented by children classes
	 * @param array 	the array to be sorted. Utilizes generic data types
	 */
	abstract public <E extends Comparable<E>> void selectionSort(E[] array);

	/**
	 * Checks to see if the array is in a sorted state (in ascending order)
	 * @param array		the array to be checked
	 * @return			a boolean value, whether or not the array is sorted
	 */
	public static final <E extends Comparable<E>> boolean isSorted(E[] array){
		if(array == null){
			return false;
		}
		for(int i = 1; i < array.length; i++){
			if(array[i] == null || array[i].compareTo(array[i-1]) < 0){			//if at any point in the array, the item at the current index has a value smaller than the item before it, the array is not sorted
				return false;
			}
		}

		return true;
	}

	/**
	 * Generates an array of random, non-unique Integers for testing purposes.
	 * @param size	The size of the array to be generated
	 * @return		The newly generated array
	 */
	public final static Integer[] generateIntegerArray(int size){
		if(size < 1){
			throw new IllegalArgumentException("Size smaller than 1 in generateArray");
		}
		Integer[] array =  new Integer[size];

		for(int i = 0; i < size; i ++){
			Integer toAdd = new Integer((int) (Math.random()*size));
			array[i] = toAdd;
		}

		return array;

	}

	/**
	 * Prints the given array for testing purposes
	 * @param array		The array to be printed
	 */
	public final static <E extends Comparable<E>> void printArray(E[] array){
		try{

			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}catch(IllegalArgumentException e){
			System.out.print("Null array in printArray");
		}
	}

	
	/**
	 * swaps two elements in an array
	 * @param array		the array containing the elements to be swapped
	 * @param index1	the index of the first element to be swapped
	 * @param index2	the index of the second element to be swapped
	 */
	public static <E extends Comparable<E>> void swap(E[] array, int index1, int index2){
		E temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}


}