import java.util.Scanner;
public class _1060PositiveNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] num=new double[6];
		for(int i=0;i<6;i++)
		{
			num[i]=input.nextDouble();
		}
		int loop=0;
		for(int i=0;i<6;i++)
		{
			if(num[i]>0)
				loop++;
		}
		System.out.println(loop+" valores positivos");
		input.close();
	}

}
