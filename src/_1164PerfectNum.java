import java.util.Scanner;
public class _1164PerfectNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] num=new int[n];
		int[] sum=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			sum[i]=0;
			for(int j=1;j<num[i];j++)
			{
				if(num[i]%j==0)
				{
					sum[i]=sum[i]+j;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(sum[i]==num[i])
			{
				System.out.println(num[i]+" eh perfeito");
			}
			else
			{
				System.out.println(num[i]+" nao eh perfeito");
			}
		}
		input.close();
	}

}
