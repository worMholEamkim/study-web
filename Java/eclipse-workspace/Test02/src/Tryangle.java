import java.util.Scanner;

public class Tryangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line[] = new int[3]; 
		
		System.out.println("���� 3���� �Է��Ͻÿ�>>");
		
		for(int i = 0;i < 3;i++) {
			line[i] = in.nextInt();
		}
		//���� �κ��� ���� ������ �Ѻ��� ���̺��� ������
		if(line[0] < line[2]||line[1] < line[2]) {
			if(line[0] + line[1] > line[2])
				System.out.println("�̰� �ﰢ���� �ǳ�?");
			else
				System.out.println("�ﰢ�� �ȵ� ������ ������ �ȵ�");
		}
		else if(line[0] < line[1]||line[2] < line[1]) {
			if(line[0] + line[2] > line[1])
				System.out.println("�̰� �ﰢ���� �ǳ�?");
			else
				System.out.println("�ﰢ�� �ȵ� ������ ������ �ȵ�");
		}
		else if(line[1] < line[0]||line[2] < line[0]) {
			if(line[1] + line[2] > line[0])
				System.out.println("�̰� �ﰢ���� �ǳ�?");
			else
				System.out.println("�ﰢ�� �ȵ� ������ ������ �ȵ�");
		}
	}
			
}
