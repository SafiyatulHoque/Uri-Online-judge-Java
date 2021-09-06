import java.util.Scanner;
public class _1101SeqNumSum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m,n;
		for(;;)
		{
			int sum=0;
			m=input.nextInt();
			n=input.nextInt();
			
			if(m==0||n==0)
				break;
			else if(m>n)
			{
				for(int j=n;j<=m;j++)
				{
					System.out.print(j+" ");
					sum=sum+j;
				}
				System.out.println("Sum="+sum);
			}
			
			else if(m<n)
			{
				for(int j=m;j<=n;j++)
				{
					System.out.print(j+" ");
					sum=sum+j;
				}
				System.out.println("Sum="+sum);
			}
			
				
		}
		input.close();
	}

}
