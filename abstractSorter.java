import java.util.Arrays;

public abstract class Sorter{
	
	abstract public <E extends Comparable<E>> void sort(E[] array);
	
	public static final <E extends Comparable<E>> boolean isSorted(E[] array){
		if(array[i] == null){
			return false;
		}
		for(int i = 1; i < array.length; i++){
			if(array[i] == null || array[i].compareTo(array[i-1]) < 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static final Integer[] generateArray(int size){
		Integer[] array = new Integer[size];
		
		for(int i = 0; i < size; i ++){
			Integer toAdd = new Integer((int) (Math.random()*size));
			array[i] = toAdd;
		}
	}
	
	
}