
/*
	Name: InsertionSort.java
	Author: Shernan Javier
	Date: Mar.6,2019
	Version: 1.0
	Description: Simple program that sorts the elements in the arrays using the Insertion Sorting Algorithm.
	Also includes Generics.
 */

package sort;

public class InsertionSort<E>
{

	public static void main(String[] args) 
	{
		//Initializes arrays 
		Integer numbers[] = { 5, 1, 4, 8, 2, 12 };
		
		Character characters[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 
				'I', 'O', 'P','A', 'S', 'D', 'F', 'G', 'H', 'J', 'K',
				'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
		
		Double decimals[] = {5.5, 1.1, 4.4, 8.8, 2.2, 12.12 };
		
		
		System.out.println("Unsorted: ");
		//Prints Integers
		for(int i = 0 ; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//Prints Characters
		for(int i = 0; i < characters.length; i++)
		{
			System.out.print(characters[i] + " ");
		}
		System.out.println();
		//Prints Decimals
		for(int i = 0; i < decimals.length; i++)
		{
			System.out.print(decimals[i] + " ");
		}
		
		//Arrays are sorted with the insertionSort method. 
		InsertionSort<Character> charSort = new InsertionSort<Character>();
		charSort.insertionSort(characters);
		
		InsertionSort<Integer> intSort = new InsertionSort<Integer>();
		intSort.insertionSort(numbers);
		
		InsertionSort<Double> doubleSort = new InsertionSort<Double>();
		doubleSort.insertionSort(decimals);
		
		System.out.println(" ");
		System.out.println();
		System.out.println("Sorted: ");
		
		//Prints Integers
		for(int i = 0 ; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//Prints Characters
		for(int i = 0; i < characters.length; i++)
		{
			System.out.print(characters[i] + " ");
		}
		System.out.println();
		//Prints Decimals
		for(int i = 0; i < decimals.length; i++)
		{
			System.out.print(decimals[i] + " ");
		}
	
	}//Main Method
	
	//Insertion sort Method.
	//If you want to learn more about how Insertion Sort works, then go to 
	//"https://www.geeksforgeeks.org/insertion-sort/"
	
	public <E extends Comparable<E>> void insertionSort(E[] elementArray)
	{
		int marker = 1;
		
		while(marker < elementArray.length)
		{
			for(int i = 0 + marker ; i > 0 ; i--)
			{
				if(elementArray[i].compareTo(elementArray[i - 1]) < 0)
				{
					swap(elementArray, i, i - 1);
				}
				else 
				{
					i = 0;
				}
			}
			marker++;
		}
	}//Insertion Sort Method
	
	//Swap method, used to swap elements within an Array.
	public <E extends Comparable<E>> void swap (E[] elementArray, int first, int second)
	{
		E hold; //temporary holding area for swap
		
		hold = elementArray[first];
		elementArray [first] = elementArray [second];
		elementArray[second] = hold;
	} //swap method
}	