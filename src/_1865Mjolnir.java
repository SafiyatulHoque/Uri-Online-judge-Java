import java.util.Scanner;
public class _1865Mjolnir {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int C=input.nextInt();
		String[] name=new String[C];
		int[] force=new int[C];
		for(int i=0;i<C;i++)
		{
			name[i]=input.next();
			force[i]=input.nextInt();
		}
		for(int i=0;i<C;i++)
		{
			if(name[i].charAt(0)=='T' &&name[i].charAt(1)=='h' &&name[i].charAt(2)=='o' &&name[i].charAt(3)=='r')
			{
				System.out.println("Y");
			}
			else
			{
				System.out.println("N");
			}
			
		}
		
		input.close();

	}

}
