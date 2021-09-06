import java.util.Scanner;
public class _1004SimpleProduct {

	public static void main(String[] args) {
		int A;
		int B;
		int PROD;
		Scanner input=new Scanner(System.in);
		A=input.nextInt();
		B=input.nextInt();
		PROD=A*B;
		System.out.println("PROD = "+PROD);
		input.close();
	}

}
