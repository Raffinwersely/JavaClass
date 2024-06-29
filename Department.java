class Collage
{
String name,name1;
Collage(String a,String b)
{
name=a;
name1=b;
}
void exam()
{
System.out.println("The name of name and name is:"+name+""+name1);
}
}




class ComputerScience extends Collage
{
String k;
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
String p;
Bca(String a,String b)
{
super(a,b);
p=b;
}

}




class Department
{
public static void main(String[]args)
{
ComputerScience subob=new ComputerScience("c","c++","java");
Bca subob1=new Bca("database","maths");
subob.exam();
subob1.exam();
}
}










