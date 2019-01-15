import java.util.Scanner;

public class ArithmeticOperator {

	public static void ArithmeticOperator() {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해 시간으로 계산해줄겤ㅋ : ");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;
		
		System.out.println(time + "초는 ");
		System.out.println(hour + "시간, ");
		System.out.println(minute + "분, ");
		System.out.println(second + "초임");
	}

}
