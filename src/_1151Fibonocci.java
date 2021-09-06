import java.util.Scanner;
public class _1151Fibonocci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] array=new int[n];
		array[0]=0;
		array[1]=1;
		for(int i=2;i<n;i++)
		{
			array[i]=array[i-1]+array[i-2];
		}
		
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
				System.out.println(array[i]);
			else
				System.out.print(array[i]+" ");
		}
		input.close();
	}

}
