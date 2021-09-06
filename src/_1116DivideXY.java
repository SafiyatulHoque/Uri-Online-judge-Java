import java.util.Scanner;
public class _1116DivideXY {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=input.nextInt();
			y[i]=input.nextInt();	
		}
		
		for(int i=0;i<n;i++)
		{
			if(y[i]==0)
				System.out.println("divisao impossivel");
			else
			{
				double k=(double) x[i];
				double l=(double) y[i];
				System.out.printf("%.1f\n",(k/l));
			}	
		}
		input.close();

	}

}
