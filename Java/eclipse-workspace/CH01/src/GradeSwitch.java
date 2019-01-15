import java.util.Scanner;
public class GradeSwitch {

	public static void GradeSwitch() {
		Scanner grade = new Scanner(System.in);
		System.out.println("니 학점 뭔데");
		String gradeValue = grade.next();
		
		switch(gradeValue) {
		
		case"a":
		case"b":
			System.out.println("쫌 하네");
			break;
		case"c":
		case"d":
			System.out.println("에... 잣네 잣어");
			break;
		case"f":
			System.out.println("이걸 학점이라고 받아왓냐? 재수강 ㄱㄱ");
			break;
		default:
			System.out.println("잘못된 학점쓰");
			
		}
	}

}
