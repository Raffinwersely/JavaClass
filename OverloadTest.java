class Overload
{
void show()
{
System.out.println("no parameters");
}
void show(int a)
{
System.out.println("The Value Of a is:" +a);
}
void show(int a,int b)
{
System.out.println("The Value Of a and b is:"+a+""+b);
}
}
class OverloadTest
{
public static void main(String [] args)
{
Overload ob=new Overload();
ob.show();
ob.show(10);
ob.show(10,20);
} 
}
 
class object 
{
public static void main(String [] args)
{
int i,j,x;
i=1;
j=4;
x=i+j;
System.out.println(x);
}
}