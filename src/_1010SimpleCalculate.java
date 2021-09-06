import java.util.Scanner;
public class _1010SimpleCalculate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int product1=input.nextInt();
		int unit1=input.nextInt();
		double price1=input.nextDouble();
		double totalPrice1=price1*unit1;
		int product2=input.nextInt();
		int unit2=input.nextInt();
		double price2=input.nextDouble();
		double totalPrice2=price2*unit2;
		double total=totalPrice1+totalPrice2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
		input.close();
	}

}
