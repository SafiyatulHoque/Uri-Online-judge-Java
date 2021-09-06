import java.util.Scanner;

public class _1189LeftArea {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double [][] M=new double [12][12];
		
		char O=input.next().charAt(0);
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<12;j++)
			{
				M[i][j]=input.nextDouble();
			}
		}
		double sum=0;
		
		if(O=='S')
		{
			for(int i=1;i<=10;i++)
			{
				if(i>=1 && i<=5)
				{
					for(int j=0;j<i;j++)
					{
						sum=sum+M[i][j];
					}
				}
				else if(i>=6 && i<=10)
				{
					for(int j=0;j<=(10-i);j++)
					{
						sum=sum+M[i][j];
					}
				}
				
			}
			System.out.printf("%.1f\n",sum);
		}
		
		else if(O=='M')
		{
			int count=0;
			for(int i=1;i<=10;i++)
			{
				if(i>=1 && i<=5)
				{
					for(int j=0;j<i;j++)
					{
						sum=sum+M[i][j];
						count++;
					}
				}
				else if(i>=6 && i<=10)
				{
					for(int j=0;j<=(10-i);j++)
					{
						sum=sum+M[i][j];
						count++;
					}
				}
				
			}
			double avg=sum/(count*1.0);
			System.out.printf("%.1f\n",avg);
		} 
		input.close();
}
}
