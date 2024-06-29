public class Emp
{
String empname;
String empadd;
public Emp()
{
empname="priyanka";
empadd="21,thomas"; 
}
public void display()
{
System.out.println("Name of Employee is "+empname);
System.out.println("Address of Employee is "+empadd);
}
public static void main(String [] args)
{
Emp empobj=new Emp();
empobj.display();
}
}