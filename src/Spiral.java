//java code to find print an array in spiral order.

import java.util.Scanner;

public class Spiral {	

	public static void main(String[] args) {
		int m=0;
		int n=0;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		m = Integer.parseInt(stdin.next());
		System.out.println("\nEnter the number of columns:\n");
		n = Integer.parseInt(stdin.next());
	    int[][] array = new int[m][n];

	    for(int i = 0; i < m; i++){
	        for (int j = 0; j < n; j++){
	            array[i][j] = i * m + (j + 1);
	            System.out.print(array[i][j] + " ");
	        } 
	        System.out.println();
	    }

	    System.out.println();
	    System.out.println("********##############################*******");
	    System.out.println("Spiral Order");
	    spiralArray(m, n, array);
	}

	public static void spiralArray(int xSize, int ySize, int matrix[][]){
	    int i,  k = 0, l = 0;
	    xSize--;  ySize--;      

	    while(k <= xSize && l <= ySize){
	        for(i = l; i <= ySize; ++i) {
	            System.out.print(matrix[k][i]+ " ");
	        }           
	        k++;

	        for(i = k; i <= xSize; ++i) {
	            System.out.print(matrix[i][ySize] + " ");
	        }
	        ySize--;
	        for(i = ySize; i >= l; --i) {
	                System.out.print(matrix[xSize][i] + " ");
	        }
	        xSize--;
	        for(i = xSize; i >= k; --i) {
	            System.out.print(matrix[i][l] + " ");
	        }
	        l++;
	    }
	}
}
