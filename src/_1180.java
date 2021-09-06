import java.util.Scanner;
public class _1180 {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int value = 0, position = 0;
	        int n = input.nextInt();
	        if (1 < n && n < 1000) {
	            int ars[] = new int[n];
	            for (int i = 0; i < ars.length; i++) {
	                ars[i] = input.nextInt();
	                if(value>ars[i]){
	                    value=ars[i];
	                    position= i;
	                }
	            }          
	            System.out.println("Menor valor: "+value+"\n"+"Posicao: "+position);
	            input.close();
	        }
	    }
	}
