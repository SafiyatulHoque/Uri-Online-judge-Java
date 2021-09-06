import java.util.Scanner;
public class _1837Preface {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int r=a%b;
		int q=(a-r)/b;
		
		System.out.printf("%d %d\n",q, r);
		
		input.close();
	}

}
