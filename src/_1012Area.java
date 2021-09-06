import java.util.Scanner;
public class _1012Area {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double A=input.nextDouble();
		double B=input.nextDouble();
		double C=input.nextDouble();
		double pi=3.14159;
		double triangle=.5*A*C;
		double circle=C*C*pi;
		double trapezium=((A+B)/2)*C;
		double square=B*B;
		double rectangle=A*B;
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",triangle,circle,trapezium,square,rectangle);
		input.close();
	}

}
