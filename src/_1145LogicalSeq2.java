import java.util.Scanner;
public class _1145LogicalSeq2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		for(int j=1;j<=y;)
		{
			for(int i=1;i<=x && j<=y;i++,j++)
			{
				if(i!=x)
					System.out.print(j+" ");
				else
					System.out.printf("%d",j);
			}
			System.out.println();
		}
		input.close();
	}

}
