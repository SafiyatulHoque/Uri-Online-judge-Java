import java.util.Scanner;
public class _1153Factorial {

	public static void main(String[] args) {
		int N, fact = 1;
		Scanner input =new Scanner(System.in);
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			fact *= i;
		}
		System.out.print(fact+"\n");
		input.close();
	}


}
