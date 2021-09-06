import java.util.Scanner;

public class _1064PositivesAverage {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] num=new double[6];
		for(int i=0;i<6;i++)
		{
			num[i]=input.nextDouble();
		}
		int loop=0;
		double sum=0.0;
		for(int i=0;i<6;i++)
		{
			if(num[i]>0)
			{
				loop++;
				sum=sum+num[i];
			}
				
		}
		double avg=(sum*1.0)/(loop*1.0);
		System.out.println(loop+" valores positivos");
		System.out.printf("%.1f\n",avg);
		input.close();
	}
}