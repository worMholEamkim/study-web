import java.util.Scanner;

public class CircleCrash {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double firX, firY, firRad, secX, secY, secRad = 0.0;
		
		System.out.println("ù ��° ���� �߽ɰ� ������ �Է� ����>>");
		firX = in.nextInt();
		firY = in.nextInt();
		firRad = in.nextInt();
	
		System.out.println("�� ��° ���� �߽ɰ� ������ �Է� ����>>");
		secX = in.nextInt();
		secY = in.nextInt();
		secRad = in.nextInt();
		
		if( Math.sqrt(Math.pow(Math.abs(firY-secY), 2) + Math.pow(Math.abs(firX - secX), 2)) <= (firRad + secRad))
			System.out.println("�� ���� ��Ĩ�ϵ���");
		else
			System.out.println("�� ��ħ ����");
			
		
	
	}

}