import java.util.Scanner;
public class _1020AgeinDays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int day=input.nextInt();
		int year=day/365;
		day=day-(year*365);
		int month=day/30;
		day=day-(month*30);
		System.out.println(year+" ano(s)");
		System.out.println(month+" mes(es)");
		System.out.println(day+" dia(s)");
		input.close();
	}

}
