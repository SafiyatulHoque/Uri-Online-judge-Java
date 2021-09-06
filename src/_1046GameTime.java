import java.util.Scanner;
public class _1046GameTime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int time1=input.nextInt();
		int time2=input.nextInt();
		int dif=(time2+24)-time1;
		if(dif>24)
			dif=dif-24;
		System.out.println("O JOGO DUROU "+dif+" HORA(S)");
		input.close();
	}

}
