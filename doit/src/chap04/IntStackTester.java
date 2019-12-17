package chap04;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료: ");
		int menu = stdIn.nextInt();
		if (menu == 0) break;
		
		int x;
		switch (menu) {
		case 1:
			System.out.println("데이터: ");
			x = stdIn.nextInt();
			try {
				s.push(x);
			} catch(IntStack.OverflowIntStackException e){
				System.out.println("스택이 가득 찼습니다.");
			}
			break;
		case 2:
			try {
				x = s.pop();
				System.out.println("팝한 데이터는 " + x + "입니다.");
			}catch (IntStack.EmptyInStackException e) {
				System.out.println("스택이 비어있습니다.");
			}
			break;
		case 3:
			try {
				x = s.peek();
				System.out.println("피크한 데이터는 " + x + "입니다.");
			} catch (IntStack.EmptyInStackException e) {
				System.out.println("스택이 비어 있습니다.");
			}
		case 4:
			s.dump();
			break;
		case 5:
			s.clear();
			System.out.println("클리어 되었습니다.");
			break;
		case 6:
			if(s.isEmpty()) {
				System.out.println("스텍이 비어있습니다.");
			}else {
				System.out.println("스텍에 데이터가 있습니다.");
			}
			break;
			
		}
		
		}
	}
}
