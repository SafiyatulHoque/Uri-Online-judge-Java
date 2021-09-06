import java.util.Scanner; 
public class _1017FuelSpent {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int hour=input.nextInt();
		int avgspd=input.nextInt();
		double distance=hour*avgspd;
		double oil=distance/12;
		System.out.printf("%.3f\n",oil);
		input.close();
	}

}
