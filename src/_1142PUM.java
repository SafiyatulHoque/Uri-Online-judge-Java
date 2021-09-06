import java.util.Scanner;
public class _1142PUM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0,j=1;i<n;i++) {
			for(int loop=0;loop<3;loop++)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println("PUM");
			j++;
		}
		input.close();
	}

}
