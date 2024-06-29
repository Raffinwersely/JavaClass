class vegetable
{
public static void main(String [] args)
{
	vegetables potato=new vegetables();
	System.out.println(potato.ans);
	vegetables carrot=new vegetables();
	carrot.ans="beetroot";
	carrot.new1();
	System.out.println(carrot.ans);
	System.out.println(potato.ans);
}
}






class vegetables
{
String ans="tomato";
public void new1()
{
System.out.println("all vegetables are good");
}
}