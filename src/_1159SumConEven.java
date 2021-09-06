import java.util.Scanner;
public class _1159SumConEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int X;
		while((X=input.nextInt())!=0)
		{
			int loop=0;
			int sum=0;
			for(int i=X;loop<5;i++)
			{
				if(i%2==0)
				{
					sum=sum+i;
					loop++;
				}
					
			}
			System.out.println(sum);
		}
		input.close();
	}

}
