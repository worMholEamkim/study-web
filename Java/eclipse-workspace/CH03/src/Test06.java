import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int count = 0;
		
		System.out.print("�ݾ��� �Է��Ͻõ���>>");
		int cash = in.nextInt();
		for(int i = 0;i < 8;i++) {
			count = cash/unit[i];
			cash = cash%unit[i];
			System.out.println(unit[i] + "�� ¥�� : " + count + "��");
		}
	}

}
