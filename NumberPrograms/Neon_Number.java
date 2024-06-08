import java.util.Scanner;

public class Neon_Number {
    public static boolean check(int n)
	{
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			
		}
		if(sum==n)
		{
			return true;
		}
		return false;
		//return n==sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		while(true) 
		{
			System.out.println("Enter a number");
			int n=sc.nextInt();
			System.out.println(check(n));
		}
	}
}
