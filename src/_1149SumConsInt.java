import java.util.Scanner;
public class _1149SumConsInt {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int A=input.nextInt();
		int N;
		do
		{
			N=input.nextInt();
		}
		while(N<=0);
		int sum=0;
		
		for(int x=1,j=A;x<=N;x++,j++)
		{
			sum=sum+j;
		}
		System.out.println(sum);
		input.close();
	}

}
