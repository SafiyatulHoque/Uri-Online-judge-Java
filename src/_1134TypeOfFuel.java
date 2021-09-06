import java.util.Scanner;
public class _1134TypeOfFuel {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		int alcohol=0;
		int gasoline=0;
		int diesel=0;
		do
		{
			do
			{
				num=input.nextInt();
				if(num==1)
					alcohol++;
				else if(num==2)
					gasoline++;
				else if(num==3)
					diesel++;
				
			}
			while(num==1 && num==2 && num==3);
		}
		while(num!=4);
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcohol);
		System.out.println("Gasolina: "+gasoline);
		System.out.println("Diesel: "+diesel);
		input.close();
	}

}
