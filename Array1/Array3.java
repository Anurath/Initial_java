class Array3
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		int[] sArr=new  int[arr.length];
		for (int i=0;i<=arr.length-1 ;i++ )
		{
			sArr[i]=arr[i]+10;
		}
		for (int i=0;i<sArr.length ;i++ )
		{
			System.out.println(sArr[i]);
		}
	}
}