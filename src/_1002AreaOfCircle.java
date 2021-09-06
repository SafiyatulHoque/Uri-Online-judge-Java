import java.util.Scanner;
public class _1002AreaOfCircle {

	public static void main(String[] args) {
		double R;
		double n=3.14159;
		Scanner input=new Scanner(System.in);
		R=input.nextDouble();
		double A=n*R*R;
		System.out.printf("A=%.4f\n",A);
		input.close();
	}

}
