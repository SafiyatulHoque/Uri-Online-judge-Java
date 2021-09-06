import java.util.Scanner;
public class _1065EvenBetweenNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<5;i++)
		{
			num[i]=input.nextInt();
		}
		
		int loop=0;
		for(int i=0;i<5;i++)
		{
			if(num[i]%2==0)
				loop++;
		}
		
		System.out.println(loop+" valores pares");
		input.close();
	}

}
