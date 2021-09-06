import java.util.Scanner;
public class _1858TheonsAnswer {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int[] array=new int[N];
		for(int i=0;i<N;i++)
		{
			array[i]=input.nextInt();
		}
		int min=array[0];
		int index=1;
		
		for(int i=1;i<N;i++)
		{
			if(min>array[i])
			{
				min=array[i];
				index=i+1;
			}
		}
		System.out.println(index);
		input.close();
	}

}
