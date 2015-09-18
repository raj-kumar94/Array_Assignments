class MaxMin1
	{
		public static void main(String... s)
		 {
			int a[][]= {{2,4,56,3},{53,254,73,4},{32,5,42,6},{65,3,5,34}};
			MaxMin1 m = new MaxMin1();
			m.max1(a);
			System.out.println("**************************************************************");
			m.min1(a);
		 }
	
	int max1(int a[][])    //larest element in a row of a matrix
		{
			int i,j;
			for(i=0;i<4;i++)
				{  int largest=0;
					for(j=0;j<4;j++)
					{
						System.out.print(a[i][j]+ "         ");
						if(largest<a[i][j])
							largest= a[i][j];
					}
				System.out.println("---->" + largest);
				}
		return 0;
		}
	
	int min1(int a[][])    //larest element in a row of a matrix
		{
			int i,j;
			for(i=0;i<4;i++)
				{  int min=99999;
					for(j=0;j<4;j++)
					{
						System.out.print(a[i][j]+ "         ");
						if(min>a[i][j])
							min= a[i][j];
					}
				System.out.println("---->" + min);
				}
		return 0;
		}
			
	}
	