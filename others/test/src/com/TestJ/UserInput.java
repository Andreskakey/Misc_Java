package com.TestJ;
import java.util.*;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;
public class UserInput {

static Scanner sc = new Scanner (System.in);

public static int getSum(int x, int y){
	return x+y;	
}
public static void changeMe(int cNum){
	cNum =11;
}
public static int getSum2 (int  ... nums){
	int sum = 0;
	for (int x: nums){
		sum+=x;
	}
	return sum;
}

 static int [] getNext2(int x){
	int [] vals = new int[2];
	vals [0] = x + 1;
	vals [1] = x + 2;
	return vals;
}
 
public static List<Object> getRandList (){
	String name = "Derek";
	int age = 20;
	return Arrays.asList(name, age);	
}


public static int factorial(int num ){
	if (num == 1){
		return 1;
	} else {
		int result = num * factorial (num - 1);
		return result;
	}
}

public static int getSum3 (int [] nums ){
	int sum = 0;
	for (int x : nums) sum += x;
	return sum;
	
}
public enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
public static void main (String args[]){
	System.out.println("Enter Name : ");
	if (sc.hasNextLine()){
		String userName = sc.nextLine();
		System.out.println("Hello "+ userName);
		
	}
	/*
	String jopName =
			JOptionPane.showInputDialog("Enter name : ");
	System.out.println("hello " +jopName);
	*/
	// ---- CONDITIONALS ----
			// Relational Operators : == != > < >= <=
			// Logical Operators : ! && ||
			int age = 12;
			if ((age >= 5) && (age <= 6)){
				System.out.println("Go to Kindergarten");
			} else if ((age >= 7) && (age <= 13)){
				System.out.println("Go to Middle School");
			} else if ((age >= 14) && (age <= 18)){
				System.out.println("Go to High School");
			} else {
				System.out.println("Stay Home");
			}
	 
			System.out.println("true || false = "+(true || false));
			System.out.println("!true = "+(!true));
	 
			// The ternary operator returns the 1st value
			// when the condition is true and the 2nd
			// otherwise
			boolean canVote = (age >= 18) ? true : false;
			System.out.println("Can Vote : "+canVote);
	 
			// Switch is used when you have limited options
			String lang = "France";
			switch(lang) {
			case "Chile": case "Cuba":
				System.out.println("Hola");
	 
				// Without break the next condition
				// is checked
				break;
			case "France":
				System.out.println("Bonjour");
				break;
			case "Japan":
				System.out.println("Konnichiwa");
				break;
			default:
				System.out.println("Hello");
			}
	 
			// ---- LOOPING ----
			for(int i = 0; i < 5; i++) {
				System.out.println(i);
				
			}
			System.out.println();
			// while loops as long as a condition is true
			int wI = 0;
			while (wI < 20) {
	 
				// Only print even numbers
				if(wI % 2 == 0) {
					System.out.println(wI);
					wI++;
					// Jump back to the beginning of loop
					continue;
				}
				if(wI >= 10) {
					// Stop looping
					break;
				}
				wI++;
			}
	 
			// Do whiles execute at least once
			int secretNum = 7;
			int guess = 0;
			do {
				System.out.println("Guess : ");
				if(sc.hasNextInt()){
					guess = sc.nextInt();
				}
			}while(secretNum != guess);
			System.out.println("You guessed it");
			System.out.println();
			
			// ---- METHODS ----
			System.out.println("5 + 4 = " + getSum(5,4));
	 
			// All data passed to a function is pass by
			// value so changes in the method have no
			// effect outside of the function
			System.out.println("6 + 5 =" + getSum(6,5));
			
			int cNum = 0;
			changeMe(cNum);
			System.out.println("cNum = " + cNum);
	 
			// You can pass a variable number of values
			// to a method
			System.out.println("1+2+3 = " + getSum2(1,2,3));
	 
			// You can receive multiple values with an array
			int[] multVA = getNext2(5);
			// 1 line for loop
			for(int x: multVA) System.out.println(x);
	 
			// Receive multiple values of different types
			List<Object> randList = getRandList();
			System.out.println(randList);
	 
			// Demonstrate recursion (functions calling
			// themselves)
			System.out.println("Fact 4 = " + factorial(4));
	 
			// Pass array to method
			int[] nums = {1,2,3};
			System.out.println("Sum = " + getSum3(nums));
	 
			// ---- EXCEPTION HANDLING ----
			// Used to catch errors that could crash
			// our program
	 
			// Surround problem code with a try block
			try {
				// int badInt = 10 / 0;
	 
				// You can create your own exception
				// classes or just throw one without
				throw new Exception("Bad Stuff");
			}
			// Catch division by 0
			catch(ArithmeticException ex) {
				System.out.println("Can't divide by zero");
				System.out.println(ex.getMessage());
				System.out.println(ex.toString());
			}
			// Catch any exception
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			// Executed whether exception occurred or not
			// Used to close files, DBs and other clean up
			finally {
				System.out.println("Clean Up");
			}
	 
			// ---- ENUMERATED TYPES ----
			Day favDay = Day.Monday;
			System.out.println("Fav day is "+favDay);
	 
	
}
}
