import java.util.Scanner;
public class _1172ArrayReplace {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] X=new int[10];
		for(int i=0;i<10;i++)
		{
			X[i]=input.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			if(X[i]>0)
				System.out.printf("X[%d] = %d\n",i,X[i]);
			else
			{
				X[i]=1;
				System.out.printf("X[%d] = %d\n",i,X[i]);
			}
		}
		input.close();
	}

}
