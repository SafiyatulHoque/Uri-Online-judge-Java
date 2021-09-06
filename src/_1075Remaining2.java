import java.util.Scanner;
public class _1075Remaining2 {

  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int n=input.nextInt();
   for(int i=0;i<=10000;i++)
   {
     if(i%n==2){
       System.out.println(i);
     }
   }
   input.close();
  }
}