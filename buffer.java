import java.util.Scanner;
class buffer {
    public static void main(String [] args)
    {
        Scanner a=new Scanner(System.in);

        System.out.println("Hello");
        String b=a.nextLine();

        System.out.println("World");
        String c=a.nextLine();

        System.out.println(1105);
        int d=a.nextInt();

        StringBuffer sb=new StringBuffer();
        sb.append(d);
        sb.append(c);
        sb.append(d);
        String message=sb.toString();
        System.out.println(message);

    }
}
