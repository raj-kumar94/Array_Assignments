class FirstRepeatingElement
{
	public static void main(String... s)
	{
		int a[]= {3,2,34,3,2,23,23,32,32,4};
		FirstRepeatingElement f= new FirstRepeatingElement();
		f.firstRepeatingElement(a);
	}

	void firstRepeatingElement(int a[])
	{
		int temp;
		int flag=31231;
		for(int i=0;i<a.length;i++)
		{	
		  for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
					{
					flag=a[i];
					}
			}
			
			if(flag==a[i])
				break;
		}
		System.out.println("first Non repeating element is: "+flag);
	}
	
}