import java.util.Scanner;
public class _1789RaceSlugs {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int L=input.nextInt();
		int level=0;
		int [] spd=new int[L];
		for(int i=0;i<L;i++)
		{
			spd[i]=input.nextInt();
		}
		int max=spd[0];
		for(int i=0;i<L;i++)
		{
			if(max<spd[i])
			{
				max=spd[i];
			}
		}
		
		if(max<10)
		{
			level=1;
		}
		else if(max>=10 && max<20)
		{
			level=2;
		}
		else if(max>=20)
		{
			level=3;
		}
		System.out.println(level);
		input.close();
	}

}
