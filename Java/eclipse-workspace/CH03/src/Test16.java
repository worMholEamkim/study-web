import java.util.Scanner;


public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com[] = {"����", "����", "��"};
		
		while(true) {
			System.out.print("����, ����, �� �Է�(�����)>>");
			String user = sc.nextLine();
			
			if(user.equals("�׸�"))
			{
				System.out.println("������ �����մϴ�.");
				break;
				
			}
			int index = (int)(Math.random()*3);
			String strCom = com[index];
			
			System.out.println("����" + user);
			System.out.println("����" + strCom);
			
			if(user.equals("����"))
			{
				if(strCom.equals("����"))
					System.out.println("���");
				else if(strCom.equals("����"))
					System.out.println("�� ��");
				else if(strCom.equals("��"))
					System.out.println("�̱�!");
			
			}
			
			else if(user.equals("����"))
			{
				if(strCom.equals("����"))
					System.out.println("�̱�!");
				else if(strCom.equals("����"))
					System.out.println("���");
				else if(strCom.equals("��"))
					System.out.println("���Ф�");
			
			}
			
			else if(user.equals("��"))
			{
				if(strCom.equals("����"))
					System.out.println("�� ��");
				else if(strCom.equals("����"))
					System.out.println("�̱�!");
				else if(strCom.equals("��"))
					System.out.println("�� ��");
			
			}
		
		}
		
		
		
		
		
	}

}
