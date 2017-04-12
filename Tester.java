/**
 * A main class used to test each of the sorting algorithms
 * 
 * @author Andy
 * @version 4/12/17
 *
 */
public class Tester {

	public static void main(String[] args){

		BasicSorter basic = new BasicSorter();
		int basicSize = 10;
		int preSortHash;

		System.out.print("BUBBLESORT:\n___________________________\nBubbleSort before being sorted: ");
		Integer[] array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("BubbleSort after being sorted: ");
		preSortHash = abstractSorter.arrayHash(array);
		basic.bubbleSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("BubbleSort sorted correctly");
		}else{
			System.out.println("BubbleSort sorted incorrectly");
		}

		System.out.println();


		System.out.print("SELECTIONSORT:\n___________________________\nSelectionSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("SelectionSort after being sorted: ");
		preSortHash = abstractSorter.arrayHash(array);
		basic.selectionSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("SelectionSort sorted correctly");
		}else{
			System.out.println("SelectionSort sorted incorrectly");
		}

		System.out.println();

		System.out.print("INSERTIONSORT:\n___________________________\nInsertionSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("InsertionSort after being sorted: ");
		preSortHash = abstractSorter.arrayHash(array);
		basic.insertionSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array)){
			System.out.println("InsertionSort sorted correctly");
		}else{
			System.out.println("InsertionSort sorted incorrectly");
		}
		
		System.out.println();

		MergeSorter merge = new MergeSorter();
		System.out.print("MERGESORT:\n___________________________\nMergeSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("MergeSort after being sorted: ");
		preSortHash = abstractSorter.arrayHash(array);
		merge.mergeSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("MergeSort sorted correctly");
		}else{
			System.out.println("MergeSort sorted incorrectly");
		}
		
		System.out.println();

		ShellSorter shell = new ShellSorter();
		System.out.print("ShellSort:\n___________________________\nShellSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("ShellSort after being sorted: ");
		preSortHash = abstractSorter.arrayHash(array);
		shell.shellSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("ShellSort sorted correctly");
		}else{
			System.out.println("ShellSort sorted incorrectly");
		}
		
		System.out.println();

		QuickSorter quick = new QuickSorter();
		System.out.print("QuickSort:\n___________________________\nQuickSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		preSortHash = abstractSorter.arrayHash(array);
		//Integer[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		abstractSorter.printArray(array);
		System.out.print("QuickSort after being sorted: ");
		quick.quickSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("QuickSort sorted correctly");
		}else{
			System.out.println("QuickSort sorted incorrectly");
		}

		Heap<Integer> intHeap = new Heap<Integer>();
		System.out.println("\nHEAPSORT:\n___________________________");
		intHeap.extract();
		intHeap.insert(5);
		intHeap.insert(3);
		intHeap.insert(20);
		intHeap.insert(15);
		intHeap.insert(10);
		intHeap.insert(12);
		intHeap.insert(8);
		intHeap.insert(2);
		System.out.println("\nCurrent heap:");
		intHeap.printHeap();
		intHeap.extract();
		intHeap.extract();
		intHeap.extract();
		System.out.println("\nHeap after removal:");
		intHeap.printHeap();
		intHeap.insert(null);

		System.out.println();
		System.out.println();

		HeapSorter heap = new HeapSorter();
		System.out.print("HeapSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		preSortHash = abstractSorter.arrayHash(array);
		System.out.print("HeapSort after being sorted: ");
		heap.heapSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array) && preSortHash == abstractSorter.arrayHash(array)){
			System.out.println("HeapSort sorted correctly");
		}else{
			System.out.println("HeapSort sorted incorrectly");
		}
		
		


	}
}
