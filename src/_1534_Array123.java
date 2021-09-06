import java.util.Scanner;
public class _1534_Array123 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int array[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(j==((N-1)-i))
				{
					array[i][j]=2;
				}
				else if(i==j)
				{
					array[i][j]=1;
				}
				else
				{
					array[i][j]=3;
				}
				
			}
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}	
	}

}
