import java.util.Scanner;
public class _1021BanknotesCoins {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double amount=input.nextDouble();
		int n100=(int)(amount/100);
		amount=amount%100;
		int n50=(int)(amount/50);
		amount=amount%50;
		int n20=(int)(amount/20);
		amount=amount%20;
		int n10=(int)(amount/10);
		amount=amount%10;
		int n5=(int)(amount/5);
		amount=amount%5;
		int n2=(int)(amount/2);
		amount=amount%2;
		
		int p100=(int)(amount/1);
		amount=amount%1;
		int p50=(int)(amount/0.50);
		amount=amount%0.50;
		int p25=(int)(amount/0.25);
		amount=amount%0.25;
		int p10=(int)(amount/0.10);
		amount=amount%0.10;
		int p05=(int)(amount/0.05);
		amount=amount%0.05;
		int p01=(int)(amount/0.01);
		
		System.out.println("NOTAS:");
		System.out.println(n100+" nota(s) de R$ 100.00");
		System.out.println(n50+" nota(s) de R$ 50.00");
		System.out.println(n20+" nota(s) de R$ 20.00");
		System.out.println(n10+" nota(s) de R$ 10.00");
		System.out.println(n5+" nota(s) de R$ 5.00");
		System.out.println(n2+" nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(p100+" moeda(s) de R$ 1.00");
		System.out.println(p50+" moeda(s) de R$ 0.50");
		System.out.println(p25+" moeda(s) de R$ 0.25");
		System.out.println(p10+" moeda(s) de R$ 0.10");
		System.out.println(p05+" moeda(s) de R$ 0.05");
		System.out.println(p01+" moeda(s) de R$ 0.01");
		input.close();
	}

}
