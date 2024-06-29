class bitwise
{
public static void main(String[] args)
{
int a=12,b=13;
System.out.println(a&b);
System.out.println(a|b);
System.out.println(a^b);
System.out.println(a<<b);
System.out.println(a>>b);
System.out.println(a>>>2);
System.out.println(a-b);
a<<=2;
System.out.println(a);
System.out.println(a<<=2);
System.out.println(a>>=2);
System.out.println(a>>>=2);
System.out.println(a&=b);
System.out.println(a|=b);
System.out.println(a^=b);
}
}