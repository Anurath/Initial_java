import java.util.Scanner;
class Series4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series length : ");
		int len = sc.nextInt();
		int startNum = 79;
		int updateNum = 23;
		for (int i=0;i<len ;i++ )
		{
			System.out.print(startNum+ " " );
			updateNum++;
			for (int j=2;j<updateNum ;j++ )
			{
				if (updateNum%j==0)
				{
					updateNum++;
					j=2;
				}
			}
			System.out.println(updateNum);
			startNum+=updateNum;
		}
	}
}