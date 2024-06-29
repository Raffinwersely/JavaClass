class claobj
{
public static void main(String [] args)
{
	lion a=new lion();
	System.out.println(a.ans);
	a.new1();
	lion b=new lion();
	b.ans=4;
	b.new1();
	System.out.println(b.ans);
	System.out.println(a.ans);
}
}
class lion
{
int ans=8;
public void new1()
{
	System.out.println("this is the lion");
}
}