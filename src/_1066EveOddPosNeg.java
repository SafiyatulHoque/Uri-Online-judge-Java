import java.util.Scanner;
public class _1066EveOddPosNeg {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[6];
		for(int i=0;i<5;i++)
		{
			array[i]=input.nextInt();
		}
		
		int even=0,odd=0,pos=0,neg=0;
		
		for(int i=0;i<5;i++)
		{
			if(array[i]%2==0)
				even++;
			if(array[i]%2!=0)
				odd++;
			if(array[i]>0)
				pos++;
			if(array[i]<0)
				neg++;
		}
		System.out.println(even+" valor(es) par(es)");
		System.out.println(odd+" valor(es) impar(es)");
		System.out.println(pos+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");
		input.close();
	}

}
