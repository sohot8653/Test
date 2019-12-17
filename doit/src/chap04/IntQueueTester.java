package chap04;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		IntAryQueue s = new IntAryQueue(64);
		
		while (true) {
			System.out.println("데이터 " + (s.getNum()) + " / " + s.getMax());
			System.out.println("(1)큐 (2)디큐(0)종료: ");
		int menu = stdIn.nextInt();
		if (menu == 0) break;
		
		int x;
		switch (menu) {
		case 1:
			System.out.println("데이터: ");
			x = stdIn.nextInt();
			try {
				s.queue(x);
			} catch(IntStack.OverflowIntStackException e){
				System.out.println("스택이 가득 찼습니다.");
			}
			break;
		case 2:
			try {
				x = s.deQueue();
				System.out.println("디큐한 데이터는 " + x + "입니다.");
			}catch (IntStack.EmptyInStackException e) {
				System.out.println("스택이 비어있습니다.");
			}
			break;
		
		case 3:
			
		}
		
		}
	}
}
