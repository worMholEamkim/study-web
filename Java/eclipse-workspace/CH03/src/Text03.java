import java.util.Scanner;

public class Text03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("������ �Է��ϼ�>>");
		n = in.nextInt();
		for(int i=n;i>0;--i) {
			for(int j= i;j>0;j--) {
				System.out.print("*");
		}
			System.out.println("");
	}
		
	
	in.close();
	}

}
