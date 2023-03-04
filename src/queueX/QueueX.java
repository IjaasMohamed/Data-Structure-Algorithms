package queueX;

public class QueueX {

	private int queueArr[];
	int maxSize;
	int rear;
	int front;
	int noOfItems;
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		rear = -1;
		front = 0;
		noOfItems = 0;
	}
	public void insert(int j) {
		if(!isFull()) {
			queueArr[++rear] = j;
			noOfItems ++;
		}
	}
	public int remove() {
		if(!isEmpty()) {
			noOfItems --;
			return queueArr[front++];
		} else {
			System.out.println("Queue is Empty");
			return -99;
		}
	}
	public boolean isEmpty() {
		return (noOfItems == 0);
	}
	public boolean isFull() {
		return (rear == (maxSize -1));
	}
}
