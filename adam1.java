class adam1
{
public static void main(String [] args)
{
switch(2)
{
case 1:
int n=12,a=0;
a=(n*n);
System.out.println(a);
break;

case 2:
int a1=121,b=a1,c=0,r=0;

while(b>0)
{
c=c*10+(b%10);
b=b/10;
}
if(a1==c)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
}