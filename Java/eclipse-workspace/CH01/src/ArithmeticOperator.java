import java.util.Scanner;

public class ArithmeticOperator {

	public static void ArithmeticOperator() {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��� �ð����� ������ف��� : ");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;
		
		System.out.println(time + "�ʴ� ");
		System.out.println(hour + "�ð�, ");
		System.out.println(minute + "��, ");
		System.out.println(second + "����");
	}

}
