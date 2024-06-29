class Vegetable
{
int i,j;
Vegetable(int a,int b)
{
i=a;
j=b;
}
void vegetable()
{
System.out.println("The vegetable of name and i is:"+j+"" +j);
}
}



class Vegetable1 extends Vegetable
{
int p;
Vegetable1(int a,int b,int c)
{
super(a,b);
p=c;
}
void vegetable()
{
System.out.println("p:"+p);
}
}


class Vegetable2 extends Vegetable
{
int z;
Vegetable2(int a,int b,int c)
{
super(a,b);
z=c;
}
void vegetable()
{
System.out.println("z:"+z);
}
}


class Carrot 
{
public static void main(String[]args)
{
Vegetable1 subob=new Vegetable1(876,109,42);
Vegetable2 subob1=new Vegetable2(32,42,109);
subob.Vegetable1();
subob1.Vegetable2();
}
}