import java.util.Scanner;
public class _1045TriangleTypes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double newA,newB,newC;
		newA=Math.max(A,Math.max(B,C));
		newB=0;
		newC=0;
		if(newA==A)
		{
			newB = Math.max(B, C);
			newC = Math.min(B, C);
		}
		else if(newA==B)
		{		
			newB = Math.max(A, C);
			newC = Math.min(A, C);	
		}
		else if(newA==C)
		{		
			newB = Math.max(A, B);
			newC = Math.min(A, B);	
		}
		
		if(newA>=(newB+newC))
			System.out.println("NAO FORMA TRIANGULO");
		else
		{
			if( (newA*newA) == ((newB*newB)+(newC*newC)))
				System.out.println("TRIANGULO RETANGULO");
			if( (newA*newA) > ((newB*newB)+(newC*newC)))
				System.out.println("TRIANGULO OBTUSANGULO");
			if( (newA*newA) < ((newB*newB)+(newC*newC)))
				System.out.println("TRIANGULO ACUTANGULO");
			if( newA == newB && newA == newC && newB == newC)
				System.out.println("TRIANGULO EQUILATERO");
			if( ((newA == newB)&&(newA!=newC && newB!=newC)) || ((newA == newC)&&(newA!=newB && newC!=newB)) || ((newB == newC)&&(newB!=newA && newC!=newA)) )
				System.out.println("TRIANGULO ISOSCELES");
			
		}
		input.close();
	}

}
