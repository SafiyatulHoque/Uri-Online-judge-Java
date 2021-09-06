import java.util.Scanner;
public class _1589_BonConduit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		int[][] array=new int[T][2];
		for(int i=0;i<T;i++)
		{
			for(int j=0;j<2;j++)
			{
				array[i][j]=input.nextInt();
			}
		}
		int[] sum=new int[T];
		for(int i=0;i<T;i++)
		{
			sum[i]=0;
			for(int j=0;j<2;j++)
			{
				sum[i]=sum[i]+array[i][j];
			}
			System.out.println(sum[i]);
		}
		input.close();
	}

}
