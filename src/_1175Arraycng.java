import java.util.Scanner;
public class _1175Arraycng {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] N=new int[20];
		int[] cpy=new int[20];
		
		for(int i=0;i<20;i++)
		{
			N[i]=input.nextInt();
		}
		
		for(int i=0,j=19;i<20 && j>=0;j--,i++)
		{
			cpy[j]=N[i];
		}
		for(int i=0;i<20;i++)
		{
			N[i]=cpy[i];
			System.out.printf("N[%d] = %d\n",i,N[i]);
		}
		input.close();
	}

}
