abstract class MYclass
{
abstract void abs_method();
void ord_method()
{
System.out.println("this is an ordinary method in abstract class");
}
}


class subclass extends MYclass
{
void abs_method()
{
System.out.println("this is an Abstract method which is declared in abstract class");
}
}



class AbstractTest
{
public static void main(String[]args)
{
subclass ob=new subclass();
ob.abs_method();
ob.ord_method();
}
}