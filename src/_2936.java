import java.util.Scanner;
public class _2936 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int c=input.nextInt();
		int boi=input.nextInt();
		int bot=input.nextInt();
		int m=input.nextInt();
		int l=input.nextInt();
		System.out.println(c*300+boi*1500+bot*600+m*1000+l*150+225);
		input.close();
	}

}
