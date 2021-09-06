import java.util.Scanner;
public class _1094Experiments {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int C=0,R=0,S=0;
		
		for(int i=0;i<n;i++)
		{
			int num=input.nextInt();
			char ch=input.next().charAt(0);
			switch(ch)
			{
			case 'C': C=C+num; break;
			case 'R': R=R+num; break;
			case 'S': S=S+num; break;
			}
		}
		int total=C+R+S;
		double perC=(C*1.0/total*1.0)*100.0;
		double perR=(R*1.0/total*1.0)*100.0;
		double perS=(S*1.0/total*1.0)*100.0;
		System.out.println("Total: "+total+" cobaias" );
		System.out.println("Total de coelhos: "+C);
		System.out.println("Total de ratos: "+R);
		System.out.println("Total de sapos: "+S);
		System.out.printf("Percentual de coelhos: %.2f %%\n",perC);
		System.out.printf("Percentual de ratos: %.2f %%\n",perR);
		System.out.printf("Percentual de sapos: %.2f %%\n",perS);
		input.close();
	}

}
