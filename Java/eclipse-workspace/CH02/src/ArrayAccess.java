import java.util.Scanner;

public class ArrayAccess {

	public static void ArrayAccess() {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("���� 5�� �Է��ع� ū �� ���� ����� ��");
		for(int i = 0;i < 5;i++) {
			intArray[i] = in.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("�Էµ� ������ ���� ū ����" + max + "�� ��");		
	}

}
