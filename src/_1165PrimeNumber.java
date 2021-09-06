import java.util.Scanner;
public class _1165PrimeNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int loop=0;
			for(int j=2;j<num[i];j++)
			{
				if(num[i]%j==0)
				{
					loop=1;
					break;
				}
			}
			if(loop==0)
				System.out.println(num[i]+" eh primo");
			else if(loop==1)
				System.out.println(num[i]+" nao eh primo");
		}
		input.close();

	}

}
