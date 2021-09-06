import java.util.Scanner;
public class _1013 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int ab=(a+b+Math.abs(a-b))/2;
		int abc=(ab+c+Math.abs(ab-c))/2;
		System.out.println(abc+" eh o maior");
		input.close();
	}

}
