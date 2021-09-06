import java.util.Scanner;
public class _1132MultiplesOf13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int sum=0;
		if(x>y)
		{
			for(int i=y;i<=x;i++)
			{
				if(i%13!=0)
					sum=sum+i;
			}
		}
		else if(y>x)
		{
			for(int i=x;i<=y;i++)
			{
				if(i%13!=0)
					sum=sum+i;
			}
		}
		
		System.out.println(sum);
		input.close();
	}

}
