import java.util.*;

class test
{
public static void main(String [] args)
{
int input;
do
{
Scanner p=new Scanner(System.in);



System.out.println("Enter the name :");
String r=p.nextLine();

System.out.println("Enter the age :");
int i=p.nextInt();

p.nextLine();
System.out.println("Enter the father name :");
String y=p.nextLine();

System.out.println("Enter the mother name :");
String a=p.nextLine();

System.out.println("Enter the address :");
String n=p.nextLine();

System.out.println("Enter the place :");
String k=p.nextLine();


if(i>18 && k=="mayiladuthurai")
{
System.out.println(r+" eligeble to stay "+n);
}
else
{
System.out.println(r+" not eligeble to stay "+n);
}


input=p.nextInt();
}while(input>0);
}
}
