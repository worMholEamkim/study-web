
public class CMain 
{
	public static void main(String[] args)
	{
		int i = 20;
		int s;
		
		
		Hello2 h1 = new Hello2();
		CircleArea h2 = new CircleArea();
		TypeConversion h3 = new TypeConversion();
		BitShiftOprerator h4 = new BitShiftOprerator();
		ScannerExam h5 = new ScannerExam();
		ArithmeticOperator h6 = new ArithmeticOperator();
		ClassCredit h7 = new ClassCredit();
		GradeSwitch h8 = new GradeSwitch();
		ArrayAccess h9 = new ArrayAccess();
		ArrayLength h10 = new ArrayLength();
		
		s = h1.sum(i, 10);
		System.out.println("10 + i = " + s);
		h2.circle();
		System.out.println("\n < �ڷ��� ���� �������� >");
		h3.typec();
		System.out.println("\n < ���� �� ��Ʈ >");
		h4.bitshift();
		System.out.println("\n");
		h5.ScannerE();
		h6.ArithmeticOperator();
		h7.ClassCredit();
		h8.GradeSwitch();
		h9.ArrayAccess();
		h10.ArrayLength();
	}
}
