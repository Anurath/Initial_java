import java.util.Scanner;
class MinNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int min =9;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (min>rem)
			{
				min= rem;
			}
		}
		System.out.println(min);
	}
}