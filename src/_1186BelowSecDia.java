import java.util.Scanner;

public class _1186BelowSecDia {

	public static void main(String[] args){

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
				for(int i=1;i<12;i++)
				{
					for(int loop=1,j=11;loop<=i;j--,loop++)
					{
						sum=sum+M[i][j];
					}
				}
				System.out.printf("%.1f\n",sum);
			}
			
			else if(O=='M')
			{
				int count=0;
				for(int i=1;i<12;i++)
				{
					for(int loop=1,j=11;loop<=i;j--,loop++)
					{
						sum=sum+M[i][j];
						count++;
					}
				}
				double avg=sum/(count*1.0);
				System.out.printf("%.1f\n",avg);
			} 
			input.close();
	}
}
