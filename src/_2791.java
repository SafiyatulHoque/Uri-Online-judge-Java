import java.util.Scanner;
public class _2791 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int index=0;
		for(int i=1;i<=4;i++)
		{
			int x=input.nextInt();
			if(x==1)
				index=i;
		}
		System.out.println(index);
		input.close();
	}

}
