public class Image_90_Degree 
{
public static void main(String[] args) 
{
    
}
static void inversion(int[][] matrix)
{
    int n = matrix.length;
for (int row = 0; row < matrix.length; row++) 
{
 for (int column = row+1; column < matrix.length; column++) 
 {
  matrix[row][column]^=matrix[column][row];   
  matrix[column][row]^=matrix[row][column];   
  matrix[row][column]^=matrix[column][row];   
 }    
}
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n/2; j++) {
        // Swap matrix[i][j] with matrix[i][n-j-1]
        matrix[i][j] ^= matrix[i][n-j-1];
        matrix[i][n-j-1] ^= matrix[i][j];
        matrix[i][j] ^= matrix[i][n-j-1];
    }
}
}    
}
