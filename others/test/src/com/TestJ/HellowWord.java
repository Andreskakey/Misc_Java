package com.TestJ;
import java.util.*;
import java.util.stream.IntStream;
public class HellowWord {
	static Scanner sc = new Scanner (System.in);
	final double SHORTPI= 3.14159;
	public static void main(String[] args) {
	
		
		System.out.println("Java Hello 2 World");
		int IncMe = 0;
		
		System.out.println("Ince "+ (IncMe++));
		//System.out.println("Ince "+ (++IncMe));
		System.out.println("Ince "+ (++IncMe));
		
		System.out.println();
		System.out.println("Next");		
		int MinNum= 5;
		int MaxNum =20;
		int randNum = MinNum +(int)(Math.random()*
				((MaxNum-MinNum)+1));
		System.out.println("Rand : "+ randNum);
	
	String name = "Tom";
	String wName= name + " Doe";
	wName += " is my name";
	String drsDog = "k" +9;
	
	System.out.println(wName.charAt(0));
	System.out.println(wName.contains("Tom"));
	System.out.println(wName.indexOf("Tom"));
	System.out.println(wName.length());
	
	System.out.println("Apple equals Orange : " + 
		("Apple".equalsIgnoreCase("Orange")));
	
	System.out.println(wName.compareTo("ABCD"));
	
	System.out.println(wName.replace("Tom", "Jack"));
	
	System.out.println(wName.substring(0,5));
	
	for (String x: wName.split(" "))
		System.out.println(x);
	
//============================================================
	
	System.out.println("\n");
	
	StringBuilder sb = new StringBuilder("I'm a string builder");
	System.out.println(sb.length ());
	System.out.println(sb.capacity());
	sb.append("Yep");
	System.out.println(sb.insert(6, "Big"));
	System.out.println(sb.replace(6, 9, "Wig"));
	System.out.println(sb.substring(6,10));
	System.out.println(sb.delete(6, 10));
	System.out.println(sb.charAt(10));
	System.out.println(sb.indexOf("Yep"));
	
	
	//============================================================
	System.out.println("\n");
	int [] arr = new int [10];
	arr [0]= 1;
	Arrays.fill(arr, 2);
	System.out.println(arr[0]);
	System.out.println();
	System.out.println(arr.length);
	System.out.println();
	String [] arr2= {"one","Two"};
	int [] OneTo10= IntStream.rangeClosed(1,10).toArray();
	
	for (int x: OneTo10) System.out.println(x);
	
	System.out.println(Arrays.binarySearch(OneTo10,9));
	
	int arr3[][] = new int [2][2];
	System.out.println();
	String [][] arr4= {{"00","10"},
					  {"01","11"}};
	System.out.println(arr4 [1][1]);
	System.out.println();
	String [][][] arr5 = {{{"000"}, {"100"}, {"200"}, {"300"}},
			{{"010"}, {"110"}, {"210"}, {"310"}},
			{{"020"}, {"120"}, {"220"}, {"320"}}};
	System.out.println(arr5[2][3][0]);
	
	//for (int x : arr) System.out.println(x);
	System.out.println();
	// Copy array into another
			int a6[] = {1,2,3};
			int a7[] = Arrays.copyOf(a6, 3);
	 
			// Compare arrays
			System.out.println(Arrays.equals(a6, a7));
	 
			// Sort array
			int a8[] = {3,5,1};
			Arrays.sort(a8);
			System.out.println(Arrays.toString(a8));
			
			// ---- ARRAYLIST ----
			// ArrayLists resize and provide for easy
			// insertion and deletion
			// Create a String ArrayList with 20 spaces
			ArrayList<String> aL1 = new ArrayList<String>(20);
	 
			// Add value
			aL1.add("Sue");
	 
			// Generate an ArrayList
			ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
			for(Integer x: aL2) System.out.println(x);
	 
			// Get a value
			System.out.println(aL2.get(1));
	 
			// Add a value at index
			aL2.set(1, 5);
	 
			// Delete value (Delete all aL2.clear())
			aL2.remove(3);
	 
			// Iterators are used to cycles through
			// collections like ArrayLists
			Iterator it = aL2.iterator();
	 
			// Loop while more values exist
			while(it.hasNext()) {
				// Output each value
				System.out.println(it.next());
				
				// ---- LINKEDLIST ----
				// Best when you have to make changes
				// in the middle of the list
				// Each link has a reference to the value
				// before and the value after
				System.out.println();
				LinkedList<Integer> lL1 = new LinkedList<Integer>();
		 
				// Add value
				lL1.add(1); lL1.add(2); lL1.add(3);
		 
				// Add array to list
				lL1.addAll(Arrays.asList(1,2,3,4));
		 
				// Add to front (addLast Also)
				lL1.addFirst(0);
		 
				// Check if in list
				System.out.println(lL1.contains(4));
		 
				// Get index for match
				System.out.println(lL1.indexOf(4));
		 
				// Replace
				lL1.set(0, 2);
		 
				// Get value
				// Also getFirst, getLast
				System.out.println(lL1.get(0));
		 
				// Delete (clear() removes all)
				lL1.remove(1);
		 
				// Get size
				System.out.println(lL1.size());
		 
				// Convert to array
				Object[] a9 = lL1.toArray();
				for (Integer x: lL1) System.out.println(x);
			}
	}

}
