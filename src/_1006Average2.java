import java.util.Scanner;
public class _1006Average2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double avg=((A*2)+(B*3)+(C*5))/10;
		System.out.printf("MEDIA = %.1f\n",avg);
		scan.close();
	}

}
