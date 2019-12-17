package chap04;

public class Queue {

	private int[] array;
	private int head;
	private int tail;
	
	public Queue(int size) {
		array = new int[size];
		head = -1;
		tail = -1;
	}
	
	public void enQueue(int number) {
		
		if(tail == array.length -1) throw new RuntimeException("큐가 다참");
		
		array[++tail] = number;
		
	}
	
	public int deQueue() {
		if (tail == -1) throw new RuntimeException("큐에 데이터 없음");
		int temp = array[++head];
		
		if(head == tail) {
			head = -1;
			tail = -1;
		}
		
		return temp;
	}
}
