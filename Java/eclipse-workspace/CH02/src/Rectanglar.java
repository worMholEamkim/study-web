import java.util.Scanner;

public class Rectanglar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loc[] = new int[2];
		
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻù�>>");
		for(int i = 0;i < 2;i++)
			loc[i] = in.nextInt();
		
		if(100<loc[0] && 200>loc[0]) {
			if(100<loc[1] && 200>loc[1])
				System.out.println("("+loc[0]+","+loc[1]+") �� �簢�� �ȿ� �ֽ��ϴ�");
			else 
				System.out.println("("+loc[0]+","+loc[1]+") �� �簢�� �ȿ� ���� ��");
		}		
		else if(100<loc[1] && 200>loc[1]) {
			if(100<loc[0] && 200>loc[0])
				System.out.println("("+loc[0]+","+loc[1]+") �� �簢�� �ȿ� �ֽ��ϴ�");
			else 
				System.out.println("("+loc[0]+","+loc[1]+") �� �簢�� �ȿ� ���� ��");
		}
		else
			System.out.println("("+loc[0]+","+loc[1]+") �� �簢�� �ȿ� ���� ��");
		
				
	}

}
