class MatrixMultiply
{
	public static void main(String... s)
	{
	int matrix1[][]= {{2,3,2},{2,5,3},{3,2,4}}; 
	int matrix2[][]= {{3,3,5},{1,3,3},{1,3,0}};
	int matrix3[][] = new int[3][3];
	MatrixMultiply ma = new MatrixMultiply();
	ma.sum(matrix1,matrix2,matrix3);
	ma.display(matrix1,matrix2,matrix3);
	}

	int sum(int matrix1[][], int matrix2[][], int matrix3[][])
	{
		int sum=0;
	for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				for(int k=0;k<matrix1[i].length;k++)
				{
					sum = sum+ matrix1[i][k]+ matrix2[k][j];
				}
				matrix3[i][j]=sum;
				 sum = 0;
			}
		}
	return 0;
	}

	void display(int matrix1[][], int matrix2[][], int matrix3[][])
	{ int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(matrix1[i][j]+ "  ");
			}
		System.out.print("       ");	
			for(j=0;j<3;j++)
			{
				System.out.print(matrix2[i][j]+ "  ");
			}
			
			System.out.println();
		}
			
	System.out.println();
	for(i=0;i<3;i++)
		{
		System.out.print("         ");
			for(j=0;j<3;j++)
			{
				System.out.print(matrix3[i][j]+ "  ");
			}
			System.out.println();
		}
	
	}
	
	
	
}