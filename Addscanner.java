
import java.util.Scanner;
class Addscanner
{

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first integer");
System.out.println("Enter second integer");
int a=s.nextInt();
int b=s.nextInt();
int c=a+b;
System.out.println("sum is" +c);


}
}