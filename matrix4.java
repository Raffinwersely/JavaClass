class matrix4
{
public static void main(String [] args)
{
int a[][]={{0,1,1,0},{2,0,0,2},{3,0,0,3},{0,4,4,0}};
int b[][]={{0,4,4,0},{3,0,0,3},{2,0,0,2},{0,1,1,0}};
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(a[i][j]+b[i][j]+" ");
}
System.out.println();
}
int c[][]=new int[4][2];
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}