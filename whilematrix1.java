class whilematrix1
{
public static void main(String [] args)
{
int a[][]={{1,4,7},{2,5,8},{3,6,9}};
int b[][]={{2,5,8},{3,6,9},{2,5,8}};

int c[][]=new int[3][3];
int i=0;
while(i<3)
{
int j=0;
while(j<3)
{
c[i][j]=0;
int k=0;
while(k<3)
{
c[i][j]+=a[i][k]*b[k][j];
k++ ;
}
System.out.print(c[i][j]+" ");
j++;
}
i++;
System.out.println();
}
}
}