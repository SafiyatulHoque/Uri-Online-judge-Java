import java.util.Scanner;
public class _1933 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		if(x>y)
			System.out.println(x);
		else if(x<y)
			System.out.println(y);
		else if(x==y)
			System.out.println(x);
		input.close();
	}

}
