class matrix1
{
public static void main(String [] args)
{
int a[][]={{5,8,2},{4,7,1},{6,9,3}};
int b[][]={{6,9,3},{4,7,1},{5,8,2}};

int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}