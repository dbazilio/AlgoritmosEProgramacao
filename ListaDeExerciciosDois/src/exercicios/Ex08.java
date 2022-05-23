package exercicios;

public class Ex08 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 13; i < 73; i++) {
			if(i % 2 == 0) {
				x += i;
				y++;
			}
			
		}
		System.out.println(x / y);

	}

}
