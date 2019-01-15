import java.util.Scanner;

public class ArrayAccess {

	public static void ArrayAccess() {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("숫자 5개 입력해바 큰 수 내가 골라즘 ㅋ");
		for(int i = 0;i < 5;i++) {
			intArray[i] = in.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max + "임 ㅋ");		
	}

}
