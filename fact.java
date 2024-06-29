class fact
{
public static void main(String [] args)
{
int i=1,fact=1;
int number=5;
while(i<=number)
{
fact=fact*i;
i++;
}
System.out.println("Factoial number"+number+" is:"+fact);
}
}