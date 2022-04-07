package ch04;
import java.util.Scanner;

public class GstackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Gstack<String> s = new Gstack<String>(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/"+s.capacity());
			
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			String x;
			switch(menu) {
			case 1:
				System.out.print("데이터:");
				x=stdIn.next();
				try {
					s.push(x);
				} catch (Gstack.OverflowGstackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				}catch (Gstack.EmptyGstackException e) {
					System.out.println("스택이 비어이습니다.");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch (Gstack.EmptyGstackException e) {
					System.out.println("스택이 비어이습니다.");
				}
				break;
				
			case 4:
				s.dump();				
				break;
				
			case 5:
				System.out.print("데이터:");
				x=stdIn.next();
				int reslut=s.indexOf(x);
				if(reslut > 0)
					System.out.println("검색 데이터의 인덱스는 " + reslut + "입니다.");
				else
					System.out.println("검색 데이터가 없습니다");
				break;
				
			case 6:
				s.clear();				
				break;
				
			case 7:
				if(s.isEmpty())
					System.out.println("빈 스택");
				else
					System.out.println("스택 데이터 존재");
				break;
				
			case 8:
				if(s.isFull())
					System.out.println("스택 꽉참");
				else
					System.out.println("스택 여유공간 있음");
				break;
			}
		}

	}

}
