import java.util.Scanner;

public class Tryangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line[] = new int[3]; 
		
		System.out.println("舛呪 3鯵研 脊径馬獣推>>");
		
		for(int i = 0;i < 3;i++) {
			line[i] = in.nextInt();
		}
		//拙精 砧痕税 杯戚 蟹袴走 廃痕税 掩戚左陥 掩嬢醤敗
		if(line[0] < line[2]||line[1] < line[2]) {
			if(line[0] + line[1] > line[2])
				System.out.println("戚惟 誌唖莫戚 鞠革?");
			else
				System.out.println("誌唖莫 照吉 いいい 煽軒亜 照喫");
		}
		else if(line[0] < line[1]||line[2] < line[1]) {
			if(line[0] + line[2] > line[1])
				System.out.println("戚惟 誌唖莫戚 鞠革?");
			else
				System.out.println("誌唖莫 照吉 いいい 煽軒亜 照喫");
		}
		else if(line[1] < line[0]||line[2] < line[0]) {
			if(line[1] + line[2] > line[0])
				System.out.println("戚惟 誌唖莫戚 鞠革?");
			else
				System.out.println("誌唖莫 照吉 いいい 煽軒亜 照喫");
		}
	}
			
}

