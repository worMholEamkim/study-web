import java.util.Scanner;

public class EqualProgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputInt, tenPosi, onePosi = 0;
		
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		inputInt = in.nextInt();
		tenPosi = inputInt / 10;
		onePosi = inputInt % 10;
		if(tenPosi == onePosi) 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� ����");
		else
			System.out.println("10�ڸ��� 1�ڸ� �ٸ� ��");
				
	}
}
