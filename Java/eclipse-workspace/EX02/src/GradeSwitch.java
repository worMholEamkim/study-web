import java.util.Scanner;
public class GradeSwitch {

	public static void GradeSwitch() {
		Scanner grade = new Scanner(System.in);
		System.out.println("�� ���� ����");
		String gradeValue = grade.next();
		
		switch(gradeValue) {
		
		case"a":
		case"b":
			System.out.println("�� �ϳ�");
			break;
		case"c":
		case"d":
			System.out.println("��... ��� ���");
			break;
		case"f":
			System.out.println("�̰� �����̶�� �޾ƿӳ�? ����� ����");
			break;
		default:
			System.out.println("�߸��� ������");
			
		}
	}

}
