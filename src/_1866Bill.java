import java.util.Scanner;
public class _1866Bill {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=input.nextInt();
			if(n%2==0)
			{
				System.out.println("0");
			}
			else
				System.out.println("1");
		}
		input.close();
	}

}
