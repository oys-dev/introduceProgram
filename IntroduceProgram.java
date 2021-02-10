import java.util.Scanner;
public class IntroduceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				
		boolean stop = false;
		
		while(!stop) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			String alphabet = scanner.next();
			if((boolean) alphabet.equals("e")||alphabet.equals("E")) {
				System.out.println("안녕히 가세요.");
				break;
			}
			if((boolean) alphabet.equals("i")||alphabet.equals("I")) {
				System.out.println("안녕하세요!");
				System.out.println("함께 공부합시다!");
				
			}
			
			if((boolean) alphabet.equals("c")||alphabet.equals("C")) {
				do {
					System.out.println("수업을 소개합니다.");
					System.out.println("(P)ython (J)ava (i)os (B)ack");
					String alphabet2 = scanner.next();
				
					if((boolean) alphabet2.equals("p")||alphabet2.equals("P")) {
						System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
						System.out.println("강사: 황경하");
						System.out.println("추천 선수과목: 없음");
				
					}
					
					if((boolean) alphabet2.equals("j")||alphabet2.equals("J")) {
						System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
						System.out.println("강사: 윤종희");
						System.out.println("추천 선수과목: Python");
				
					}
					
					if((boolean) alphabet2.equals("i")||alphabet2.equals("I")) {
						System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
						System.out.println("강사: 조행래");
						System.out.println("추천 선수과목: Python, Java");
				
					}
					if((boolean) alphabet2.equals("b")||alphabet2.equals("B")) {
						break;
				
					}
				} while(!stop);
			}
		}
		
		
	}

}
