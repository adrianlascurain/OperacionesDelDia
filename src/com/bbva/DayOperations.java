package com.bbva;

import java.util.ArrayList;
import java.util.Arrays;

/* This class use the implementations of TellerWindow, Client and Alex classes to calculate
 * time units that Alex have to wait until all his operations are completed
*/
public class DayOperations {
	public static void main(String[] args) {
		
		// Generate instances of TellerWindow and include Transactions number as arguments.  
		// The las element of the array passed to the constructor will be Alex needed number of transactions.
		TellerWindow tellerWindow = new TellerWindow(new ArrayList<Integer>(Arrays.asList(3,1,5,2,1,2)));
		
		System.out.println("Inicio \n");
		
		// Call method to calculate unit of time to wait
		int waitedTime = tellerWindow.calculateAlexWaitTime();
		
		// Print result and indicate the end of the porgram
		System.out.println("Alex ha esperado [" + waitedTime + "] unidades de tiempo.");
		
		System.out.println("\nTermino");
	}
	
}
