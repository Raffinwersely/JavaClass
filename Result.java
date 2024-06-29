class Collage
{
String name;
Collage(String a,String b)
{
name=a;
name=b;
}
void exam()
{
System.out.println("The name of name and name is:"+name+""+name);
}
}


class ComputerScience extends Collage
{
String name,k;
ComputerScience(String a,String b,String c)
{
super(a,b);
k=c;
}
void exam()
{
System.out.println("k:"+k);
}
}

class Bca extends Collage
{
String name,p;
Bca(String a,String b,String c)
{
super(a,c);
p=b;
}
void exam()
{
System.out.println("p:"+p);
}
}

class Result
{
public static void main(String[]args)
{
ComputerScience subob=new ComputerScience("c","c++","java");
Bca subob1=new Bca("database","maths","aws");
subob.exam();
subob1.exam();
}
}










