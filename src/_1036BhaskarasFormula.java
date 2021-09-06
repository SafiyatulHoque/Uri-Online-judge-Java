import java.util.Scanner;
public class _1036BhaskarasFormula {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double A=input.nextDouble();
		double B=input.nextDouble();
		double C=input.nextDouble();
		if(((B*B)-(4*A*C))<0 || A==0)
		{
			System.out.println("Impossivel calcular");
		}
		else
		{
			double R1= (-B+Math.sqrt(B*B-4*A*C))/(2*A);
			double R2= (-B-Math.sqrt(B*B-4*A*C))/(2*A);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n",R1,R2);
		}
		input.close();	
	}

}
