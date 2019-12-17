package chap04;

public class IntAryQueue {
	private int max;
	private int num;
	private int tmp;
	private int[] que;
	
	public class EmptyIntQueException extends RuntimeException{
		public EmptyIntQueException() {}
	}
	
	public class OverflowIntQueException extends RuntimeException{
		public OverflowIntQueException() {}
	}
	
	public IntAryQueue(int capacity) {
		max = capacity;
		num = 0;
		try {
			que = new int[max];
		} catch ( OutOfMemoryError e) {
			max = 0;
		}
	
	}
	
	
	
	public int getMax() {
		return max;
	}



	public void setMax(int max) {
		this.max = max;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int queue(int x) throws OverflowIntQueException{
		if(num >= max) throw new OverflowIntQueException();
		return que[num++] = x;
	}
	
	public int deQueue() throws OverflowIntQueException{
		if(num <= 0) throw new OverflowIntQueException();
		int returnQue = que[0];
		
		for(int i=0; i<num-1 ; i++) {
			que[i]=que[i+1];
			
		}
		num--;
		return returnQue;
	}
}
