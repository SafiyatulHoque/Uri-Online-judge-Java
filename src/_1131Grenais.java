import java.util.Scanner;
public class _1131Grenais {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice;
		int inter=0;
		int gremio=0;
		int draw=0;
		int game=0;
		do
		{
			game++;
			int interG=0;
			int greG=0;
			interG=input.nextInt();
			greG=input.nextInt();
			if(interG>greG)
				inter++;
			else if(interG<greG)
				gremio++;
			else if(interG>greG)
				draw++;
			do
			{
				System.out.println("Novo grenal (1-sim 2-nao)");
				choice=input.nextInt();
			}
			while(choice!=1 && choice!=2);
		}
		while(choice==1);
		
		System.out.println(game+" grenais");
		System.out.println("Inter:"+inter);
		System.out.println("Gremio:"+gremio);
		System.out.println("Empates:"+draw);
		
		if(inter>gremio)
			System.out.println("Inter venceu mais");
		else if(inter<gremio)
			System.out.println("Gremio venceu mais");
		else if(inter==gremio)
			System.out.println("Não houve vencedor");
		input.close();
	}

}
