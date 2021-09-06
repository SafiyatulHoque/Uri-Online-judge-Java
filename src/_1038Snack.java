import java.util.Scanner;
public class _1038Snack {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int code=input.nextInt();
		int Q=input.nextInt();
		double total;
		switch(code) {
			case 1:
			{
				total=4.00*Q;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
			}
			case 2:
			{
				total=4.50*Q;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
			}
			case 3:
			{
				total=5.00*Q;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
			}
			case 4:
			{
				total=2.00*Q;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
			}
			case 5:
			{
				total=1.50*Q;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
			}
		}
		input.close();
		
	}

}
