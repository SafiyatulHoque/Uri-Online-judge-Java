import java.util.Scanner;
public class _1009SalaryWithBonus {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		double salary=input.nextDouble();
		double product=input.nextDouble();
		double total=salary+((product*15)/100);
		System.out.printf("TOTAL = R$ %.2f\n",total);
		input.close();
	}

}
