import java.util.Scanner;
class Series2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series length : ");
		int len = sc.nextInt();
		int start = 2;
		for (int i= 0;i<len ;i++ )
		{
			int op =1;
			for (int j=0;j<3 ;j++ )
			{
				op*=start;
			}
			op+=start;
			System.out.println(op);
			start++;
		}
	}
}