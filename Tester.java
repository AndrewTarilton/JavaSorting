/**
 * A main class used to test each of the sorting algorithms
 * 
 * @author Andy
 * @version 3/13/17
 *
 */
public class Tester {
	public static void main(String[] args){
		
		int bubbleSize = 10;
		System.out.print("BubbleSort before being sorted: ");
		BubbleSorter bubSort = new BubbleSorter(bubbleSize);
		Integer[] arr = BubbleSorter.generateArray(bubSort.getSize());
		bubSort.printArray(arr);
		System.out.print("BubbleSort after being sorted: ");
		bubSort.sort(arr);
		bubSort.printArray(arr);
		if(bubSort.isSorted(arr)){
			System.out.println("BubbleSort sorted correctly");
		}else{
			System.out.println("BubbleSort sorted incorrectly");
		}
		
		
	}
}
