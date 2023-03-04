package queueX;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//Write a main program to create an object called mainQueue 
//with 5 elements of the QueueX class. This is used to store 
// transactions IDs

		QueueX mainQueue = new QueueX(5);
		
//Allow the user to input 5 transaction IDs from the keyboard
//and store them in printerQueue.
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1 ; i <= 5 ; i ++ ) {
	
			System.out.println("Enter transaction id " );
			int in = sc.nextInt();
			mainQueue.insert(in);
		}
		sc.close();
		//object Creation
		
		QueueX evenQueue = new QueueX (5);
		QueueX oddQueue = new QueueX(5);
		
//You are required to send these transactions to separate PCs
//based on the transaction ID. Transactions sent to PC1 contains
//even transaction IDs and transactions sent to PC2 contain odd
//IDs. Create two objects called evenQueue and oddQueue to store 
//these details.
		
		int value;
		
		while (!mainQueue.isEmpty()) {
			
			value = mainQueue.remove();
			
			if(value % 2 == 0) {
				evenQueue.insert(value);
			} else {
				oddQueue.insert(value);
			}
		}
//Write the code to remove the numbers and display the result 
		
		System.out.println("PC1");
		
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction : "+evenQueue.remove());			
		}
		
		System.out.println("PC2");
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction : "+oddQueue.remove());
		}
		
	}

}
