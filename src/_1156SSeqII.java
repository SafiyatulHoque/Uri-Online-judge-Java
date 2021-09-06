public class _1156SSeqII {

	public static void main(String[] args) {
		double S=0.0;
		for(double i=1.0,j=1.0;i<=39.0;i=i+2.0,j=j*2.0)
		{
			S=(i/j)+S;
		}
		System.out.printf("%.2f\n",S);
	}

}
