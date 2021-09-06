import java.util.Scanner;
public class _1047GameTimeMinutes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int iHour=input.nextInt();
		int iMin=input.nextInt();
		int fHour=input.nextInt();
		int fMin=input.nextInt();
		int iTotal=(iHour*60)+iMin;
		int fTotal=((fHour*60)+fMin)+1440;
		
		int dif=fTotal-iTotal;
		
		if(dif>1440)
			dif=dif-1440;
		
		int hour=dif/60;
		dif=dif-(hour*60);
		int minute=dif;
		
		System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
		input.close();
	}

}
