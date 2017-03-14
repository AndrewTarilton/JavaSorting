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
		Integer[] bubArr = BubbleSorter.generateArray(bubSort.getSize());
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
		Integer[] selectArr = SelectionSorter.generateArray(selectSort.getSize());
		selectSort.printArray(selectArr);
		System.out.print("SelectionSort after being sorted: ");
		selectSort.sort(selectArr);
		SelectionSorter.printArray(selectArr);
		if(selectSort.isSorted(selectArr)){
			System.out.println("SelectionSort sorted correctly");
		}else{
			System.out.println("SelectionSort sorted incorrectly");
		}
	}
}
