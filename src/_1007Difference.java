import java.util.Scanner;
public class _1007Difference {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		int D=input.nextInt();
		int dif=(A*B-C*D);
		System.out.println("DIFERENCA = "+dif);
		input.close();
	}

}
