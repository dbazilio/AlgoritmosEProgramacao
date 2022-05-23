package exercicios;

public class Ex10 {

	public static void main(String[] args) {
		double x = 1;
		for (int i = 2; i <= 20; i++) {
			
			x = x + (1.0/i);
			System.out.println("1/"+ i);
		}
		System.out.println(x);

	}

}
