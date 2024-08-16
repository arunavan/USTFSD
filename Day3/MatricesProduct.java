package Day3;

public class MatricesProduct {

	public static void main(String[] args) {
		
		int A[][] = {{2,3},{1,2}};
		int B[][] = {{2,4},{2,1}};
		
		int c[][] = new int[A.length][B[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				for(int k=0;k<A.length;k++)
				{
					c[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}

	}

}
