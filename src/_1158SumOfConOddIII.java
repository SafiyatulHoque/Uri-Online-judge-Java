import java.util.Scanner;
public class _1158SumOfConOddIII {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int[] x=new int[N];
		int[] y=new int[N];
		int[] sum=new int[N];
		for(int i=0;i<N;i++)
		{
			x[i]=input.nextInt();
			y[i]=input.nextInt();
		}
		
		for(int i=0;i<N;i++)
		{
			sum[i]=0;
			int num=x[i];
			for(int j=0;j<y[i];)
			{
				if(num%2!=0)
				{
					sum[i]=sum[i]+num;
					j++;
				}
				num++;
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(sum[i]);
		}
		input.close();
	}

}
