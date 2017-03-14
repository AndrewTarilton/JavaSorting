/**
 * A main class used to test each of the sorting algorithms
 * 
 * @author Andy
 * @version 3/14/17
 *
 */
public class Tester {
	public static void main(String[] args){
		
		int bubbleSize = 10;
		System.out.print("BubbleSort before being sorted: ");
		BubbleSorter bubSort = new BubbleSorter(bubbleSize);
		Integer[] bubArr = BubbleSorter.generateArray();
		bubSort.printArray(bubArr);
		System.out.print("BubbleSort after being sorted: ");
		bubSort.sort(bubArr);
		bubSort.printArray(bubArr);
		if(bubSort.isSorted(bubArr)){
			System.out.println("BubbleSort sorted correctly");
		}else{
			System.out.println("BubbleSort sorted incorrectly");
		}
		
		System.out.println();
		
		int selectionSize = 10;
		System.out.print("SelectionSort before being sorted: ");
		SelectionSorter selectSort = new SelectionSorter(selectionSize);
		Integer[] selectArr = SelectionSorter.generateArray();
		selectSort.printArray(selectArr);
		System.out.print("SelectionSort after being sorted: ");
		selectSort.sort(selectArr);
		SelectionSorter.printArray(selectArr);
		if(selectSort.isSorted(selectArr)){
			System.out.println("SelectionSort sorted correctly");
		}else{
			System.out.println("SelectionSort sorted incorrectly");
		}
		
		System.out.println();
		
		int insertionSize = 10;
		System.out.print("InsertionSort before being sorted: ");
		InsertionSorter insertSort = new InsertionSorter(insertionSize);
		Integer[] insertArr = InsertionSorter.generateArray();
		insertSort.printArray(insertArr);
		System.out.print("InsertionSort after being sorted: ");
		insertSort.sort(insertArr);
		InsertionSorter.printArray(insertArr);
		if(insertSort.isSorted(insertArr)){
			System.out.println("InsertionSort sorted correctly");
		}else{
			System.out.println("InsertionSort sorted incorrectly");
		}
		
	}
}
