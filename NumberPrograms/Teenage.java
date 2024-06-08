
public class Teenage
{
	public static boolean check(int a)
	{
		if(a>=13 && a<=19)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(check(11));	
		System.out.println(check(13));
		System.out.println(check(16));
		System.out.println(check(21));
		System.out.println(check(15));
	}

}
