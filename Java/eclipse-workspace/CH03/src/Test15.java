import java.util.Scanner;
import java.util.InputMismatchException;

public class Test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		do {
		try {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(n + "x" + m + "=" + n*m);
		break; //�ݺ���
		}
		catch(InputMismatchException e) {
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			continue;
			
		}
		
		}while(true);
		
		scanner.close();
		
		
	}

}
