import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = 0;
		
		System.out.println("���� �Է��غ�����(1~12) >> ");
		month = in.nextInt();
		
		if (month <= 5 && month >= 3)
			System.out.println("���� ��");
		else if (month <= 8 && month >= 6)
			System.out.println("������ ��");
		else if (month <= 11 && month >= 9)
			System.out.println("�������� ��");
		else 
			System.out.println("�ܿ��� ��");
		
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���� ��"); break;
			case 6:
			case 7:
			case 8:
				System.out.println("������ ��"); break;
			case 9:
			case 10:
			case 11:
				System.out.println("������ ��"); break;
			case 12:
			case 1:
			case 2:
				System.out.println("�ܿ��� ��"); break;
		}
	}

}
