import java.util.Scanner;
import java.util.Random;

public class challenge03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		
		
		int random = rd.nextInt(100);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������. 0-99");
		aa:
		for(int i = 0;i<100;i++) {
			System.out.print(i+">>");
			int solve = in.nextInt();
			if  (random > solve)
				System.out.println("�� ����");
			else if (random < solve)
				System.out.println("�� ����");
			else {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
				String regame = in.next();
				if (regame == "y") 
					continue aa;
				else if( regame == "n")
					break aa;
			}
		
			
	}
	}
}

