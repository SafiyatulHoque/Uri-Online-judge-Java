import java.util.Scanner;
public class _1160PopulationIncrease {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		
		int[] year=new int[T];
		for(int i=0;i<T;i++)
		{
			int PA=input.nextInt();
			int PB=input.nextInt();
			double G1=input.nextDouble();
			double G2=input.nextDouble();
			
			year[i]=0;
			while(PA<=PB)
			{
				PA=(int)(PA+(PA*G1/100));
				PB=(int)(PB+(PB*G2/100));
				year[i]=year[i]+1;
				if(year[i]==101)
					break;
				
			}
		}
		for(int i=0;i<T;i++)
		{
			if(year[i]<=100)
			{
				System.out.println(year[i]+" anos.");
			}
			else
			{
				System.out.println("Mais de 1 seculo.");
			}
				
		}
		input.close();
	}

}
