import java.util.Scanner;
public class _1044Multiplies {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y;
		x=input.nextInt();
		y=input.nextInt();
		if(x%y==0 || y%x==0)
		{
			System.out.println("Sao Multiplos");
		}
		else
			System.out.println("Nao sao Multiplos");
		input.close();
	}
	

}
