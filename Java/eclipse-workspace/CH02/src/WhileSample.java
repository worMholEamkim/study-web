import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int n = 0;
		float sum = 0;
		int i = 0;
		while((i = rd.nextInt()) != 0) {
			sum += i;
			n++;
			//System.out.println(sum);
		}
	System.out.println("�Էµ� ���� ������ "+ n +"���̸� ����� "+ sum / n +"�Դϴ�");
	}

}