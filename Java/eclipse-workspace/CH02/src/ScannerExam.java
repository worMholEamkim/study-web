import java.util.Scanner;

public class ScannerExam {
	public static void ScannerE() {
		Scanner a = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력해봐 ");
		System.out.println("니 나이는" + a.nextInt() + "살임");
		System.out.println("니 무게는" + a.nextDouble() + "kg임");
		System.out.println("니 키는" + a.nextDouble() + "cm임 ㅋ");
	}
}
