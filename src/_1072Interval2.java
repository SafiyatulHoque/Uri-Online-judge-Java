import java.util.Scanner;
public class _1072Interval2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int [] x=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=input.nextInt();
		}
		
		int in=0,out=0;
		for(int i=0;i<n;i++)
		{
			if(x[i]>=10 && x[i]<=20)
				in++;
			else
				out++;
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
		input.close();
	}

}
