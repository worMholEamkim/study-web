
public class NestedLoop {

	public static void main(String[] args) {
		int i, j;
		
		for(i = 1;i < 10;i++,System.out.println()) {
			for(j = 1;j < 10;j++,System.out.println()) {
				System.out.println(i + "*" + j + "=" + i * j );
			}
		}
	}

}
