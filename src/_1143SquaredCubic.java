import java.util.Scanner;
public class _1143SquaredCubic {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" "+(i*i)+" "+(i*i*i));
		}
		input.close();
	}

}
