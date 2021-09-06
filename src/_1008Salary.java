import java.util.Scanner;
public class _1008Salary {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int wh=input.nextInt();
		double s=input.nextDouble();
		double salary=wh*s;
		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$ %.2f\n",salary);
		input.close();
	}

}
