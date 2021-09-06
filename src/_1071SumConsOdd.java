import java.util.Scanner;
public class _1071SumConsOdd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int sum=0;
		if(x>y)
		{
			
			for(int i=y+1;i<x;i++)
			{
				if(i%2!=0) {
					sum=sum+i;
				}
					
			}
			
		}
		
		else
		{
			
			for(int i=x+1;i<y;i++)
			{
				if(i%2!=0) {
					sum=sum+i;
				}
					
			}
			
		}
		System.out.println(sum);
		
		input.close();
	}

}
