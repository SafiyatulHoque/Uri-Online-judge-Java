import java.util.Scanner;
public class _1874WelWinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();

		if(a > b && b <= c) System.out.println(":)");
		else if(a < b && b >= c) System.out.println(":(");
		else if(a < b && b < c && (c - b) < (b - a)) System.out.println(":(");
		else if(a < b && b < c && (c - b) >= (b - a)) System.out.println(":)");
		else if(a > b && b > c && (c - b) > (b - a)) System.out.println(":)");
		else if(a > b && b > c && (c - b) <= (b - a)) System.out.println(":(");
		else if(a == b && b < c) System.out.println(":)");
		else System.out.println(":(");
		input.close();
	}
}