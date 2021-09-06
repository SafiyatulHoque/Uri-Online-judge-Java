import java.util.Scanner;
public class _1113AseDesc {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y;
		while((x=input.nextInt()) != (y=input.nextInt()))
		{
			if(x>y)
				System.out.println("Decrescente");
			else if(y>x)
				System.out.println("Crescente");
		}
		input.close();
	}

}
