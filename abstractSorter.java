/**
 * forms an abstract superclass for all sorting algorithms
 * leaves the sort method to be implemented by specific sorting child classes
 * The sort and the isSorted methods can use any data type as long as the data type can be compared through Comparable
 * The generateArray and printArray methods specifically use Integers for testing purposes
 * 
 * @author Andrew Tarilton
 * @version 3/14/17
 *
 */

public abstract class AbstractSorter{
	
	protected int size;		//the size of the array to be generated
	
	/**
	 * This is the sorting method to be implemented by children classes
	 * @param array 	the array to be sorted. Utilizes generic data types
	 */
	abstract public <E extends Comparable<E>> void sort(E[] array);
	
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
	public static final Integer[] generateArray(int size){
		if(size < 1){
			throw new IllegalArgumentException("Size smaller than 1 in generateArray");
		}
		Integer[] array = new Integer[size];
		
		for(int i = 0; i < size; i ++){
			Integer toAdd = new Integer((int) (Math.random()*size));
			array[i] = toAdd;
		}
		
		return array;
	}
	
	/**
	 * Prints the array for testing purposes
	 * @param array		The array to be printed
	 */
	public static final void printArray(Integer[] array){
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
	 * getter for the size of the array to be generated
	 * @return		the size of the array to be generated
	 */
	public int getSize(){
		return size;
	}
	
	
}