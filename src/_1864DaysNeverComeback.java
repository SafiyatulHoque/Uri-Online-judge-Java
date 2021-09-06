import java.util.Scanner;
public class _1864DaysNeverComeback {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str="LIFE IS NOT A PROBLEM TO BE SOLVED";
		int N=input.nextInt();
		for(int i=0;i<N;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		input.close();
	}

}
