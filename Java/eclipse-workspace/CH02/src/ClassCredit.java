import java.util.Scanner;

public class ClassCredit {

	public static void ClassCredit() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("니 점수 몇? 학점 알려주겟음ㅋ");
		int score = in.nextInt();
		if(score > 80)
			System.out.println("니 학점 A임 올 ㅋ");
		else if(score > 70)
			System.out.println("니 학점 B임 ㅋㅋ");
		else if(score > 60)
			System.out.println("니 학점 C임 ㅋㅋ");
		else if(score > 50)
			System.out.println("니 학점 D임 ㅋㅋ");
		else if(score > 40)
			System.out.println("니 학점 F임 ㅋㅋ어떡해...");
		
		
	}

}
