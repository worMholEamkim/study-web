import java.util.Scanner;
public class EX14 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("���� ���� �Է��Ͻÿ�:");
		dividend = rd.nextInt();
		System.out.println("�������� �Է��Ͻÿ�:");
		divisor = rd.nextInt();
		try {
			System.out.print(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�.");
		}catch (ArithmeticException e ) {
			System.out.println("0���� ���� �� �������.");
		}
	}
	
}
