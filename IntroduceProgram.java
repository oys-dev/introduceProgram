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
				System.out.println("�ȳ��� ������.");
				break;
			}
			if((boolean) alphabet.equals("i")||alphabet.equals("I")) {
				System.out.println("�ȳ��ϼ���!");
				System.out.println("�Բ� �����սô�!");
				
			}
			
			if((boolean) alphabet.equals("c")||alphabet.equals("C")) {
				do {
					System.out.println("������ �Ұ��մϴ�.");
					System.out.println("(P)ython (J)ava (i)os (B)ack");
					String alphabet2 = scanner.next();
				
					if((boolean) alphabet2.equals("p")||alphabet2.equals("P")) {
						System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.");
						System.out.println("����: Ȳ����");
						System.out.println("��õ ��������: ����");
				
					}
					
					if((boolean) alphabet2.equals("j")||alphabet2.equals("J")) {
						System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.");
						System.out.println("����: ������");
						System.out.println("��õ ��������: Python");
				
					}
					
					if((boolean) alphabet2.equals("i")||alphabet2.equals("I")) {
						System.out.println("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.");
						System.out.println("����: ���෡");
						System.out.println("��õ ��������: Python, Java");
				
					}
					if((boolean) alphabet2.equals("b")||alphabet2.equals("B")) {
						break;
				
					}
				} while(!stop);
			}
		}
		
		
	}

}
