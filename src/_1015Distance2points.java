import java.util.Scanner;
public class _1015Distance2points {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("%.4f\n",distance);
		input.close();
	}

}
