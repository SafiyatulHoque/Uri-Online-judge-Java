import java.util.Scanner;
public class _1099SumConsOddII {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] sum=new int[n];
		for(int j=0;j<n;j++)
		{
			int x=input.nextInt();
			int y=input.nextInt();
			
			sum[j]=0;
			if(x>y)
			{
				
				for(int i=y+1;i<x;i++)
				{
					if(i%2!=0) {
						sum[j]=sum[j]+i;
					}		
				}
			}
			
			else
			{
				
				for(int i=x+1;i<y;i++)
				{
					if(i%2!=0) {
						sum[j]=sum[j]+i;
					}		
				}	
			}
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.println(sum[j]);
		}
		input.close();

	}

}
