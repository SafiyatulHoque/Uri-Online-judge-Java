import java.util.Scanner;
public class _2006 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int test=0;
		for(int i=0;i<5;i++)
		{
			
			int x=input.nextInt();
			if(x==t)
				test=test+1;
		}
		System.out.println(test);
		input.close();

	}

}
