import java.util.Scanner;

public class ClapClap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hund = 0;
		
		
		System.out.println("1~99 ������ ������ �Է��غ�>>");
		hund = in.nextInt();
		int tenPosi = hund / 10;
		int onePosi = hund % 10;
		if((tenPosi % 3 == 0 )&&(onePosi % 3 == 0))
			System.out.println("�ڼ�¦¦��");
		else if((tenPosi % 3 == 0 )||(onePosi % 3 == 0))
			System.out.println("�ڼ�¦��");
		else
			System.out.println("Ǳ");
		
	}
	
}
