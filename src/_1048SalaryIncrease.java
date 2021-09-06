import java.util.Scanner;
public class _1048SalaryIncrease {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double salary=input.nextDouble();
		if(salary>=0 && salary<=400.00)
		{
			double add=salary*(15.0/100.0);
			double newSalary=salary+add;
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",add);
			System.out.printf("Em percentual: 15 %%\n");
		}
		else if(salary>=400.01 && salary<=800.00)
		{
			double add=salary*(12.0/100.0);
			double newSalary=salary+add;
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",add);
			System.out.printf("Em percentual: 12 %%\n");
		}
		else if(salary>=800.01 && salary<=1200.00)
		{
			double add=salary*(10.0/100.0);
			double newSalary=salary+add;
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",add);
			System.out.printf("Em percentual: 10 %%\n");
		}
		else if(salary>=1200.01 && salary<=2000.00)
		{
			double add=salary*(7.0/100.0);
			double newSalary=salary+add;
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",add);
			System.out.printf("Em percentual: 7 %%\n");
		}
		else if(salary>2000.00)
		{
			double add=salary*(4.0/100.0);
			double newSalary=salary+add;
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",add);
			System.out.printf("Em percentual: 4 %%\n");
		}
		input.close();

	}

}
