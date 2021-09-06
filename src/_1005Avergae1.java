import java.util.Scanner;
public class _1005Avergae1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double avg=( (A*3.5) + (B*7.5) )/11;
		System.out.printf("MEDIA = %.5f\n",avg);
		scan.close();

	}

}
