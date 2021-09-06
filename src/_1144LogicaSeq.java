import java.util.Scanner;
public class _1144LogicaSeq {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=1;j++)
				System.out.println(i+" "+(i*i+j)+" "+(i*i*i+j));
		}
		input.close();
	}

}
