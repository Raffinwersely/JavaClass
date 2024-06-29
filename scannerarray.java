import java.util.*;
class scannerarray
{
public static void main(String [] args)
{
Scanner p=new Scanner(System.in);
int a=0;
while(a<5)
{
System.out.println("Enter the value :");
int r=p.nextInt();
a++;
}
int b[]=new int[5];

for(int r=0;r<b.length;r++)
{
System.out.println("Element at index"+r+":"+b[r]);
}
}
}