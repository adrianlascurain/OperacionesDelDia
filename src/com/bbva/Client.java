package com.bbva;

/* This class emulates the behaviours and attributes of a client 
 * in a queue to make operations 
 * */ 
public class Client{
	// Attributes
	protected int id;
	private static int idCounter = 0;
	protected int remainingOperations;
	protected int completedOperations = 0;
	protected int currentposition;
	protected int waitedTime = 0;
	protected boolean allOperationsDone = false;
	private static int assignedPositon = 0;
	
	// Constructor
	public Client(int operations) {
		this.id = idCounter++;
		this.remainingOperations = operations;
		this.currentposition = assignedPositon++;
	}
	
	// Methods		
	public void goForward() {
		--this.currentposition;
	}
	
	public void updateOperations() {
		--this.remainingOperations;
		++this.completedOperations;
	}
	
	public int getWaitedTime() {
		return this.waitedTime;
	}
	
	public int getRemainingOperations() {
		return this.remainingOperations;
	}
	
	public boolean getAllOperationsDone() {
		return this.allOperationsDone;
	}
	
	public int getId() {
		return id;
	}
	
	public int getCompletedOperations() {
		return this.completedOperations;
	}

	public int getCurrentposition() {
		return currentposition;
	}
	
	public void setWaitedTime(int time) {
		this.waitedTime = time;
	}
	
	public void setCurrentePosition(int position) {
		this.currentposition = position;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", remainingOperations=" + remainingOperations + ", currentposition="
				+ currentposition + ", waitedTime=" + waitedTime + ", allOperationsDone=" + allOperationsDone + "]";
	}
	
}