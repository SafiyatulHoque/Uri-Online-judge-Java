import java.util.Scanner;
public class _1028_CollectableCards {

	public static void main(String[] args){
		  Scanner input=new Scanner(System.in);
		  int x=input.nextInt();
		  int num1,num2,r=0;
		  int i=0;
		  do
		  {
		    num1=input.nextInt();
		    num2=input.nextInt();
		    for(int j=1;j<=num1 && j<=num2;j++)
		    {
		      if(num1%j==0 && num2%j==0)
		      {
		        r=j;
		      }
		    }
		    System.out.println(r);
		    i++;
		  }
		  while(i<x);
		  input.close();
		  }

		}
