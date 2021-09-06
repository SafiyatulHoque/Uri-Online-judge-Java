import java.util.Scanner;
public class _1011Sphere {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double pi=3.14159;
		double R=input.nextDouble();
		double volume=(4.0/3.0)*pi*R*R*R;
		System.out.printf("VOLUME = %.3f\n",volume);
		input.close();
	}

}
