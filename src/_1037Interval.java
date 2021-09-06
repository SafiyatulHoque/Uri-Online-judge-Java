import java.util.Scanner;
public class _1037Interval {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		if(x>=0 && x<=25.0000)
			System.out.println("Intervalo [0,25]");
		else if(x>=25.00001 && x<=50.0000)
			System.out.println("Intervalo (25,50]");
		else if(x>=50.00001 && x<=75.0000)
			System.out.println("Intervalo (50,75]");
		else if(x>=75.00001 && x<=100)
			System.out.println("Intervalo (75,100]");
		else
			System.out.println("Fora de intervalo");
		input.close();
	}

}
