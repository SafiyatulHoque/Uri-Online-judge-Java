import java.util.Scanner;
public class _1051Taxes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double salary=input.nextDouble();
		double per;
		if(salary>=0.00 && salary<=2000.00)
			System.out.println("Isento");
		else if(salary>2000 && salary<=3000.00)
		{
			per=(salary-2000)*(8.00/100.00);
			
			System.out.printf("R$ %.2f\n",per);
		}
		else if(salary>3000 && salary<=4500.00)
		{
			per=((1000)*(8/100.00))+((salary-3000)*(18/100.0));
			
			System.out.printf("R$ %.2f\n",per);
		}
		else if(salary>4500.00)
		{
			per=((1000)*(8/100.00))+((1500)*(18/100.0))+((salary-4500)*(28/100.0));
			
			System.out.printf("R$ %.2f\n",per);
		}
		input.close();
		
	}

}
