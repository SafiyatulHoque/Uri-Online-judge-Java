import java.util.Scanner;
public class _1114FixedPass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pass=2002;
		int x;
		while((x=input.nextInt())!=pass)
		{
			System.out.println("Senha Invalida");
		}
		System.out.println("Acesso Permitido");
		input.close();
	}

}
