import java.util.Scanner;

public class ClassCredit {

	public static void ClassCredit() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�� ���� ��? ���� �˷��ְ�����");
		int score = in.nextInt();
		if(score > 80)
			System.out.println("�� ���� A�� �� ��");
		else if(score > 70)
			System.out.println("�� ���� B�� ����");
		else if(score > 60)
			System.out.println("�� ���� C�� ����");
		else if(score > 50)
			System.out.println("�� ���� D�� ����");
		else if(score > 40)
			System.out.println("�� ���� F�� �������...");
		
		
	}

}
