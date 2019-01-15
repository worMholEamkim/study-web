import java.util.Scanner;

public class ArrayLength {

	public static void ArrayLength() {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[7];
		float sum = 0;
		
		for(int i = 0;i < intArray.length;i++)
			intArray[i] = in.nextInt();
		for(int i = 0;i < intArray.length;i++)
			sum = sum + intArray[i];
		
		System.out.println("이 배열원소의 평균은" + sum/intArray.length +"이고 합은" + sum + "임 ㅋ");
	
	}

}
