import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int  temp = num;
		int rev=0;
		while (num>0)
		{
			int rem =num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if (temp==rev)
		{
			System.out.println("The give number is palindrome.");
		}
		else
		{
			System.out.println("The give number is not Palindrome");
		}
	}
}