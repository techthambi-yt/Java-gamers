import java.util.Scanner;
class Verify
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your username:");
String a=sc.nextLine();
System.out.println("enter your username again:");
String b=sc.nextLine();
if(a.equals(b))
{
System.out.println("Valid");
}
else
{
System.out.println("in Valid");
}
}
}
