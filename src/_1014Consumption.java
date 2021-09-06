import java.util.Scanner;
public class _1014Consumption {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int X=input.nextInt();
		double Y=input.nextDouble();
		double avg=X/Y;
		System.out.printf("%.3f km/l\n",avg);
		input.close();

	}

}
