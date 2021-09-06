import java.util.Scanner;
public class _1074EvenOdd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] num=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			
			if(num[i]==0)
				System.out.println("NULL");
			else if(num[i]>0 && num[i]%2==0)
				System.out.println("EVEN POSITIVE");
			else if(num[i]<0 && num[i]%2==0)
				System.out.println("EVEN NEGATIVE");
			else if(num[i]>0 && num[i]%2!=0)
				System.out.println("ODD POSITIVE");
			else if(num[i]<0 && num[i]%2!=0)
				System.out.println("ODD NEGATIVE");
		}
		input.close();
	}

}
