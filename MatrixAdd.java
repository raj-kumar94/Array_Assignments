class MatrixAdd
{
	public static void main(String... s)
	{
	int matrix1[][]= {{23,3,24},{2,53,3},{3,23,4}}; 
	int matrix2[][]= {{3,3,25},{12,3,3},{13,33,0}};
	int matrix3[][] = new int[3][3];
	MatrixAdd ma = new MatrixAdd();
	ma.sum(matrix1,matrix2,matrix3);
	ma.display(matrix1,matrix2,matrix3);
	}

	int sum(int matrix1[][], int matrix2[][], int matrix3[][])
	{
	for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
			matrix3[i][j] = matrix1[i][j]+ matrix2[i][j];
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