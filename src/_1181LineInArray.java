import java.util.Scanner;
public class _1181LineInArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double [][] M=new double [12][12];
		int L=input.nextInt();
		char T=input.next().charAt(0);
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<12;j++)
			{
				M[i][j]=input.nextDouble();
			}
		}
		double sum=0;
		if(T=='S')
		{
			for(int j=0;j<12;j++)
			{
				sum=sum+M[L][j];
			}
			System.out.printf("%.1f\n",sum);
		}
		
		else if(T=='M')
		{
			for(int j=0;j<12;j++)
			{
				sum=sum+M[L][j];
			}
			double avg=sum/12.0;
			System.out.printf("%.1f\n",avg);
		}
		input.close();
		
	}

}
