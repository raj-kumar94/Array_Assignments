class MaxMin
  {
    public static void main(String... s)
	{
	  int[] a = {3,6,2,65,3,75,34,75,1};
	  MaxMin m= new MaxMin();
	  System.out.println("Largest= "+m.arrMax(a));
	  System.out.println("Min= "+m.arrMin(a));
	}
	
  int arrMax(int a[])     //max of an array
	{
		int i,largest=0;
		for(i=0;i<a.length;i++)
			{
			if(largest<a[i])
				largest= a[i];
			}
	   return largest;
	}

   int arrMin(int a[])    //min of an array
	{
		int i,min=999999;
		for(i=0;i<a.length;i++)
			{
			if(min>a[i])
				min= a[i];
			}
	   return min;
	
	}

  
  }