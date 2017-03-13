/**
 * A child class extending abstractSorter, this class implements a bubble sort
 * @author Andy
 *
 */
public class BubbleSorter extends AbstractSorter{

	/**
	 * constructor for a bubbleSort object
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
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(int i = 1; i < size; i++){
				if(array[i-1].compareTo(array[i]) > 0){
					E temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;

					swapped = true;
				}
			}	
		}
	}


}