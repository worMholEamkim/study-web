
public class BitShiftOprerator {

	public static void bitshift() {
		short a = (short)0x55ff;
		short b = 0x00ff;
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		byte c = 20;
		byte d = -8;
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d > 2);
		System.out.println(d >>> 2);
	}

}
