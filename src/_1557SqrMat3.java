import java.util.Scanner;
public class _1557SqrMat3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		while((n=input.nextInt())!=0)
		{
			int [][] num=new int[n][n];
			int number=1;
			for(int i=0;i<n;i=i++)
			{
				
				for(int j=0;j<n;j++)
				{
					num[i][j]=number;
					num[i][j]=num[i][j]*2;
					System.out.print(num[i][j]+" ");
				}
				System.out.println();
				number=number*2;
			}
		}
		input.close();
	}

}
