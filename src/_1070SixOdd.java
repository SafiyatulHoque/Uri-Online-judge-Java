import java.util.Scanner;
public class _1070SixOdd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int X=input.nextInt();
		int loop=0;
		for(int i=X; ;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				loop++;
				if(loop==6)
					break;
			}
		}
		input.close();
	}

}
