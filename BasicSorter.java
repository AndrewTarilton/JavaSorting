/**
 * A child class extending abstractSorter, this class implements selection sort, bubble sort, and insertion sort
 * 
 * @author Andy
 * @version 4/1/17
 *
 */
public class BasicSorter extends abstractSorter{
	
	
	public BasicSorter(){
		
	}
	
	@Override
	public <E extends Comparable<E>> void bubbleSort(E[] array) {
		
		if(array == null ){
			throw new IllegalArgumentException("Array is null in BubbleSorter.sort");
		}
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(int i = 1; i < array.length; i++){
				if(array[i-1].compareTo(array[i]) > 0){
					swap(array, i-1, i);

					swapped = true;
				}
			}	
		}
	}

	@Override
	public <E extends Comparable<E>> void insertionSort(E[] array) {
		if(array == null){
			throw new IllegalArgumentException("Array is null in InsertionSorter.sort");
		}
		
		int ptr;
		for(int i = 1; i < array.length; i++){
			ptr = i;
			while(ptr > 0 && array[ptr-1].compareTo(array[ptr]) > 0){
				swap(array, ptr-1, ptr);
				ptr--;
			}
		}
	}

	@Override
	public <E extends Comparable<E>> void selectionSort(E[] array) {
		if(array == null){
			throw new IllegalArgumentException("Array is null in SelectionSorter.sort");
		}
		int min;
		for(int i = 0; i < array.length; i++){
			min = i;
			for(int j = i; j < array.length; j++){
				if(array[min].compareTo(array[j]) > 0){
					min = j;
				}
			}
			swap(array, i, min);
		}
	}

}
