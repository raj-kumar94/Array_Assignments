class CountSteps
	{
		public static void main(String... s)
		{
			int sum=55;
			int count=0;
			int zero=1;
			int a[] = {8,3};
			CountSteps cs= new CountSteps();
			
			
		while(zero==1)
			{
			zero = cs.checkingForAllZero(a);
			
			if(cs.checkingSum(a)==1)
				{
				count=	cs.divisionByTwo(a,count);  //gadbad!!!! call it only when all elements are even
				} 
			else 
			{
			count=	cs.checkingForOdd(a,count);   
			}

			 
			}
			
System.out.println(count);

	}
	
		int checkingForAllZero(int a[])   //checking for all zero
			{
			int sum = 0;
			int i;
				for(i=0;i<a.length;i++)
				{
					
					sum = sum+ a[i];
				}
				
				if(sum==0)
					 return 0;
				else
					return 1;
			}
	
	
		int checkingForOdd(int a[], int count)   //checking for any odd element in an array
			{
			    
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+ " ");
					if(a[i]%2==1)
					{
					int temp = a[i];
					temp = temp-1;
					a[i]=temp;
					count++ ;
					
					}
				}
				System.out.println(" ");
			return count;
			}
			
		int checkingSum(int a[])   //checking for sum even or odd..... wrong code!!!  (sum!=0 && all elements are even)
			{ 
				int flag=0;
				int sum=0;
				int value=555;
					for(int i=0;i<a.length;i++)
					{
					  sum = sum+ a[i];
					}

				for(int i=0;i<a.length;i++)
				{
					if (a[i]%2==1)
						{
							flag=1;
							break;
						}
				}
				
			if((flag==0)&&(sum!=0))
			{	value=1;  }
			
			return value;
			}
			
			
			
	
		int divisionByTwo(int a[], int count)     // dividing all elements by 2
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
				a[i]= a[i]/2;
			}
			System.out.println(" ");
			count= count+1;
		return count;
		}
	
	}
