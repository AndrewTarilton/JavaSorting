/**
 * A main class used to test each of the sorting algorithms
 * 
 * @author Andy
 * @version 4/1/17
 *
 */
public class Tester {

	public static void main(String[] args){

		BasicSorter basic = new BasicSorter();
		int basicSize = 10;

		System.out.print("BubbleSort before being sorted: ");
		Integer[] array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("BubbleSort after being sorted: ");
		basic.bubbleSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array)){
			System.out.println("BubbleSort sorted correctly");
		}else{
			System.out.println("BubbleSort sorted incorrectly");
		}

		System.out.println();


		System.out.print("SelectionSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("SelectionSort after being sorted: ");
		basic.selectionSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array)){
			System.out.println("SelectionSort sorted correctly");
		}else{
			System.out.println("SelectionSort sorted incorrectly");
		}

		System.out.println();

		System.out.print("InsertionSort before being sorted: ");
		array = abstractSorter.generateIntegerArray(basicSize);
		abstractSorter.printArray(array);
		System.out.print("InsertionSort after being sorted: ");
		basic.insertionSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array)){
			System.out.println("InsertionSort sorted correctly");
		}else{
			System.out.println("InsertionSort sorted incorrectly");
		}

		Heap<Integer> intHeap = new Heap<Integer>();
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
		System.out.print("HeapSort after being sorted: ");
		heap.heapSort(array);
		abstractSorter.printArray(array);
		if(abstractSorter.isSorted(array)){
			System.out.println("HeapSort sorted correctly");
		}else{
			System.out.println("HeapSort sorted incorrectly");
		}


	}
}
