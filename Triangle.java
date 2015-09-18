
public class Triangle {

	public static void main(String... s)
	{
		int a[][]= {{15,10,10},{2,45,3},{13,5,10}}; 
		Triangle t= new Triangle();
		t.sumA(a);
		t.maxA(a);
		t.minA(a);
		t.sumB(a);
		t.maxB(a);
		t.minB(a);
		
	}
	
	int sumA(int a[][])
	{
		int zod=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i==0)||(j==2))
					zod=zod+a[i][j];
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("sumA = "+zod);
	return 0;	
	}
	
	
	
	int sumB(int a[][])
	{
		int zod=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i<a.length&&j==0)||(i==2&&j<a[i].length))
					zod=zod+a[i][j];	
			}
		}	
		System.out.println("sumB = "+zod);
	return 0;	
	}
	
	
	
	int maxA(int a[][])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i==0)||(j==2))
				{
					if(max<a[i][j])
						max=a[i][j];
				}
			}
		}
		System.out.println("maxA = "+ max);
	return max;	
	}
	
	int minA(int a[][])
	{
		int min=99999;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i==0)||(j==2))
				{
					if(min>a[i][j])
						min=a[i][j];
				}
			}
		}
		System.out.println("minA = "+ min);
	return min;	
	}
	
	int maxB(int a[][])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i<a.length&&j==0)||(i==2&&j<a[i].length))
					if(max<a[i][j])
						max=a[i][j];
					
			}
		}	
		System.out.println("maxB = "+max);
	return 0;	
	}
	
	int minB(int a[][])
	{
		int min=99999;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==j)||(i<a.length&&j==0)||(i==2&&j<a[i].length))
					if(min>a[i][j])
						min=a[i][j];
						
			}
		}	
		System.out.println("minB = "+min);
	return 0;	
	}
}


