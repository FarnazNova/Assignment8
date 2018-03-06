import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//declare the variables
		int i, j ;
		int row = 3;
		int col = 3;
		double [][] m1 = new double [row][col];
		double [][] m2 = new double [row][col];
		
		// get the input for the first matrix
		System.out.println("Enter matrix 1: ");
		for(i = 0; i< row; i ++)
			for(j = 0; j < col; j++)
				m1[i][j] = scan.nextDouble();
		
		// get the input for the second matrix
		System.out.println("Enter matrix 2: ");
		for(i = 0; i<row; i ++) 
			for(j = 0; j < col; j++)
				m2[i][j] = scan.nextDouble();
		
		// call the method to sum the two matrix
		addMatrix(m1, m2);
		//close the scanner
		scan.close();
		
		}
		
	// matrix sum method
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		//declare the variables
		int row = 3;
		int col = 3;
		double [][] sum =new double [row][col]; 
		//summing two matrix
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
			{
				sum[i][j] = a[i][j] + b[i][j] ;
				
			}
		
		//printing the result of sum
		System.out.println("Sum of entered matrix is: ");
		
		for( int i = 0; i < row; i++)
		{
			for( int j = 0; j < col; j++)
				System.out.print(sum[i][j] + " ");
			System.out.println();
		}
		return sum;
	}
}

