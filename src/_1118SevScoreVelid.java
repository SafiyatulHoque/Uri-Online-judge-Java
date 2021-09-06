import java.util.Scanner;
public class _1118SevScoreVelid {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double score;
		
		int again;
		do 
		{
			int loop=0;
			double sum=0.0;
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
			do
			{
				System.out.println("novo calculo (1-sim 2-nao)");
				again=input.nextInt();
			}
			while((again!=1) && (again!=2));
		}
		while(again==1);
		input.close();
	}
}
