import java.util.Scanner; 
public class _1018Banknotes {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int Note=input.nextInt();
		int n100=Note/100;
		int N=Note%100;
		int n50=N/50;
		N=N%50;
		int n20=N/20;
		N=N%20;
		int n10=N/10;
		N=N%10;
		int n5=N/5;
		N=N%5;
		int n2=N/2;
		N=N%2;
		int n1=N/1;
		System.out.println(Note);
		System.out.println(n100+" nota(s) de R$ 100,00");
		System.out.println(n50+" nota(s) de R$ 50,00");
		System.out.println(n20+" nota(s) de R$ 20,00");
		System.out.println(n10+" nota(s) de R$ 10,00");
		System.out.println(n5+" nota(s) de R$ 5,00");
		System.out.println(n2+" nota(s) de R$ 2,00");
		System.out.println(n1+" nota(s) de R$ 1,00");
		input.close();
	}
}
