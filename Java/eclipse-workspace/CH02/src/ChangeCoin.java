import java.util.Scanner;

public class ChangeCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coin, oman, man, ochun, chun, obak, bak, sip, il = 0;
		System.out.println("�� �Է��ع�>>");
		coin = in.nextInt();
		
		oman = coin/50000;
		man = (coin-(oman*50000))/10000; 
		ochun = (coin-((oman*50000)+(man*10000)))/5000;
		chun = (coin-((oman*50000)+(man*10000)+(ochun * 5000)))/1000;
		obak = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)))/500;
		bak = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)))/100;
		sip = (coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)+(bak * 100)))/10;
		il = ((coin-((oman*50000)+(man*10000)+(ochun * 5000)+(chun * 1000)+(obak * 500)+(bak * 100)+(sip * 10))) % 10);
		
		
		if(coin > 50000) {
			System.out.println("��������" + oman + "��");
			System.out.println("������" + man + "��");
			System.out.println("��õ����" + ochun + "��");
			System.out.println("õ����" + chun + "��");
			System.out.println("�����" + obak + "��");
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}
		else if(coin > 10000) {
			System.out.println("������" + man + "��");
			System.out.println("��õ����" + ochun + "��");
			System.out.println("õ����" + chun + "��");
			System.out.println("�����" + obak + "��");
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else if(coin > 5000) {			
			System.out.println("��õ����" + ochun + "��");
			System.out.println("õ����" + chun + "��");
			System.out.println("�����" + obak + "��");
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else if(coin > 1000) {			
			System.out.println("õ����" + chun + "��");
			System.out.println("�����" + obak + "��");
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else if(coin > 500) {			
			System.out.println("�����" + obak + "��");
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else if(coin > 100) {
			
			System.out.println("���" + bak + "��");
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else if(coin > 10) {			
			System.out.println("�ʿ�" + sip + "��");
			System.out.println("�Ͽ�" + il + "��");
		}else {			
			System.out.println("�Ͽ�" + il + "��");
		}
	
	}

}