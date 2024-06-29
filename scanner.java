import java.util.*;

class scanner
{
public static void main(String [] args)
	{
	Scanner p=new Scanner(System.in);

	System.out.println("Enter the value a : ");
	int a=p.nextInt();

	System.out.println("Enter the value b : ");
	int b=p.nextInt();

	System.out.println("Enter the value c : ");
	int c=p.nextInt();
	
	if(a>b && a>c)
	{
	if(b>c)
	{
	System.out.println("b is middle value");
	}
	else
	{
	System.out.println("c is middle value");
	}
	}
	if(b>a && b>c)
	{
	if(a>c)
	{
	System.out.println("a is middle value");
	}
	else
	{
	System.out.println("c is middle value");
	}
	if(c>a && c>b)
	{
	if(a>b)
	{
	System.out.println("a is middle value");
	}
	else
	{
	System.out.println("b is middle value");
	}
	}
	}
	}
}
