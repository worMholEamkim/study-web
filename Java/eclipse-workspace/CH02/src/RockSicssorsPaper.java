import java.util.Scanner;

public class RockSicssorsPaper {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String draw1, draw2;
	System.out.println("���������� �����̾�. ����, ����, �� �߿��� �Է���");
	System.out.println("ö�� >>");
	draw1 = in.next();
	System.out.println("���� >>");
	draw2 = in.next();
	
	if(draw1.equals(draw2))
		System.out.println("ö���� ���� ���� ��");
	else if(draw1.equals("����")) {
		if(draw2.equals("����")) 
			System.out.println("������ �̱� ��");
		else if(draw2.equals("��")) 
			System.out.println("ö���� �̱� ��");
		}
	else if(draw1.equals("����")) {
		if(draw2.equals("��")) 
			System.out.println("������ �̱� ��");
		else if(draw2.equals("����")) 
			System.out.println("ö���� �̱� ��");
		}
	else if(draw1.equals("��")) {
		if(draw2.equals("����")) 
			System.out.println("������ �̱� ��");
		else if(draw2.equals("����")) 
			System.out.println("ö���� �̱� ��");
		}	
}
}