import java.util.Scanner;
public class _1067OddNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int X=input.nextInt();
		for(int i=0;i<=X;i++)
		{
			if(i%2!=0)
			System.out.println(i);
		}
		input.close();

	}

}
