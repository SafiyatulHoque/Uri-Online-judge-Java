import java.util.Scanner;
public class _1146GrowingSeq {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x;
		while((x=input.nextInt())!=0)
		{
			for(int i=1;i<=x;i++) 
			{
				
				if(i<x)
					System.out.print(i+" ");
				else if(i==x)
					System.out.println(i);
			}
				
		}
		input.close();
	}

}
