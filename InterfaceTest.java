interface A
{
void meth1();
void meth2();
}


interface B extends A
{
void meth3();
}

class MYclass implements B
{
public void meth1()
{
String S="WELLCOME";
System.out.println("this is meth1 method:"+S);
}
public void meth2()
{
int a=10;
int b=5;
int c;
c=a*b;
System.out.println("this is meth2 method the value of c is:"+c);
}
public void meth3()
{
System.out.println("this is meth3 method");
}
}


class InterfaceTest
{
public static void main(String [] args)
{
MYclass MYob=new MYclass();
MYob.meth1();
MYob.meth1();
}
}