import java.util.Scanner;
public class _1117ScoreValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0.0;
		double score;
		int loop=0;
		do
		{
			score=input.nextDouble();
			if(score>=0 && score<=10)
			{
				loop++;
				sum=sum+score;
			}
			else
				System.out.println("nota invalida");
		}
		while(loop<2);
		double avg=sum/2.0;
		System.out.printf("media = %.2f\n",avg);
		input.close();
	}
}
