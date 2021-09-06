import java.util.Scanner;
public class _1759 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				System.out.print("Ho");
			}
			else
			{
				System.out.print("Ho ");
			}
		}
		System.out.println("!");
		input.close();
	}

}
