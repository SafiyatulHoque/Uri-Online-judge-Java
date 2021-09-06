import java.util.Scanner;
public class _1177ArrayFill2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		int[] N=new int[1000];
		for(int i=0;i<1000;)
		{
			for(int j=0;j<T;j++)
			{
				N[i]=j;
				System.out.printf("N[%d] = %d\n",i,N[i]);
				i++;
				if(i==1000)
					break;
			}
		}
		input.close();
	}

}
