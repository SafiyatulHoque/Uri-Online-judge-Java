import java.util.Scanner;
public class _1154Ages {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age;
		int sum=0;
		double loop=0.0;
		while((age=input.nextInt())>=0)
		{
			loop++;
			sum=sum+age;
		}
		double avg=(double)(sum/loop);
		System.out.printf("%.2f\n",avg);
		input.close();
	}

}
