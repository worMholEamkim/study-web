import java.util.Scanner;
public class Text04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�ҹ��ڸ� �Է��ϼ�>>");
		String input = in.next();
		char al = input.charAt(0);
		
		for(char i=al;i>='a';i--)
		{
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
		System.out.println("");
		}
	}

}
