import java.util.Scanner;
public class _1150ExceedingZ {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int X=input.nextInt();
		int Z;
		int sum=0;
		int loop=0;
		do
		{
			Z=input.nextInt();
			if(Z>X)
			{
				do
				{
					loop++;
					sum=sum+X;
					X++;
					
				}while(sum<=Z);
			}
		}
		while(Z<=X);
		
		System.out.println(loop);
		input.close();
	}
	

}
