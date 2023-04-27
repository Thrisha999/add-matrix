//addition of matrix
import java.util.Scanner;
class Add_matrix
{
  public static void main(String args[])
  {
    int a[][]= new int[50][50];
    int b[][]= new int[50][50];
    int c[][]= new int[50][50];
    int i,j,n,m;
    Scanner in = new Scanner(System.in);
    System.out.println("enter no. of rows: ");
    n=in.nextInt();
    System.out.println("enter no. of columns: ");
    m=in.nextInt();
    System.out.println("enter 1st matrix elements:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.println("a["+i+"]["+j+"]element");
        a[i][j]=in.nextInt();
      }
    }
    System.out.println("the matrix1 elements are:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.println(" "+a[i][j]);
      }
      System.out.println(" ");
    }
    System.out.println("enter 2nd matrix elements:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.println("b["+i+"]["+j+"]element");
        b[i][j]=in.nextInt();
      }
    }
    System.out.println("the matrix2 elements are:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.println(" "+b[i][j]);
      }
      System.out.println(" ");
    }
    System.out.println("sum of 2 matrices:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        c[i][j] = a[i][j]+b[i][j];
        System.out.println(c[i][j]+" ");
      }
      System.out.println(" ");
    }
  }
}
