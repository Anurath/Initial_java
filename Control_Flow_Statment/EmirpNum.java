import java.util.Scanner;
class EmirpNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		boolean flag1=true;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup=num;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag=false;break;
				
			}
		}
		if (flag)
		{
			int rev=0;
			for (int i=dup;i>0 ;i/=10 )
			{
				int rem=i%10;
				rev = rev*10+rem;
			}
			for (int i=2;i<rev ;i++ )
			{
				if (rev%i==0)
				{
					flag1=false;
					break;
				}
			}
		}
		if (!flag)
		{
			System.out.println("The given number is not Prime.");
		}
		else if (flag==flag1)
		{
			System.out.println("The given number is Emirp Number.");
		}
		else
		{
			System.out.println("The given number is not Emirp Number.");
		}
	}
}