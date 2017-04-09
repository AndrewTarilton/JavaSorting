import java.util.ArrayList;

/**
 * An implementation of a heap structure; it is a virtual heap, implemented using an ArrayList due to the ease with which an ArrayList can be resized and enforced by the mathematical properties surrounding parent/child indices within balanced tree structures
 * It utilizes abstract data types to allow for general use
 * 
 * @author Andy
 * @version 4/1/17
 * 
 */
public class Heap<E extends Comparable<E>> {
	private ArrayList<E> storage;	//the ArrayList that stores all of the data for this heap

	/**
	 * constructor method. It initializes the ArrayList.
	 */
	public Heap(){
		storage = new ArrayList<E >();
	}

	/**
	 * Adds an item to the heap
	 * @param item		the item to be added to the heap
	 */
	public void insert(E item){
		if(item != null){
			storage.add(item);

			int child = storage.size() - 1;		//the index in the ArrayList that the new item is stored in. 
			int parent = (child-1)/2;			//the index of the new item's parent

			while(parent >= 0 && storage.get((int) parent).compareTo(storage.get((int) child)) > 0){	//if the parent and child do not correspond to the properties of heap ordering, they're swapped
				E temp = storage.get((int) parent);
				storage.set((int) parent, storage.get((int) child));
				storage.set((int) child, temp);
				child = parent;			//the index for the child is set to that of the parent, since they've been swapped
				parent = (child-1)/2;	//and the index of the new parent is calculated
			}
			System.out.print("\n" + item.toString() + " was added to the heap.");
		}
		else{	//error message in case item is null
			System.out.print("\nNull item not added to the heap");
		}
	}

	/**
	 * Removes and returns the root of the heap, and restores the heap property
	 * @return		The root of the heap
	 */
	public E extract(){
		int size = storage.size();
		if(size > 0){
			E removed = storage.get(0);

			storage.set(0, storage.remove(size-1));		//swaps the first element in the heap with the last
			size = storage.size();

			int parent = 0;
			while(true){
				int leftChild = 2*parent+1;		//index of the parent node's left child
				int rightChild = leftChild+1;	//index of the parent node's right child
				if(leftChild >= size){		//break if the parent has no children
					break;
				}
				int smaller = leftChild;		//index of the smaller of the two children
				if(rightChild < size && storage.get(rightChild).compareTo(storage.get(leftChild)) < 0) smaller = rightChild;	//if the parent has a right child and it's smaller than the left, set smallest to the right child
				if(storage.get(parent).compareTo(storage.get(smaller)) > 0){	//swap the parent with the smaller of its children if they don't correspond to the heap property
					E temp = storage.get(parent);
					storage.set(parent, storage.get(smaller));
					storage.set(smaller, temp);
					parent = smaller;	
				}
				else{	//the heap is in proper order, so we break
					break;
				}
			}
			System.out.print("\n" + removed + " was removed from the heap.");
			return removed;
		}
		else{
			System.out.print("\nHeap is empty; there is nothing to remove");
			return null;
		}
	}

	/**
	 * prints a rudimentary representation of the heap
	 * It simply prints one level of the heap at a time, from left to right.
	 */
	public void printHeap(){
		int lineCounter = 0;
		int ptr = 0;
		for(int i = 0; i < storage.size(); i++){
			if(ptr == (int)(Math.pow(2, lineCounter))){		//since, in a balanced tree, each level contains 2^x nodes, where x is the height of the tree, this prints a new line each time 2^x "nodes" have been printed		
				System.out.println();
				lineCounter++;
				ptr = 0;
			}

			System.out.print(storage.get(i) + " ");
			ptr++;
		}
	}
}
