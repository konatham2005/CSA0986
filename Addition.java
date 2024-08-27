import java.io.*;
class Addition
{
public static void main(String args[])throws Exception
{
int a,b,c;
BufferedReader f= new BufferedReader( new InputStreamReader(System.in));
System.out.println("Enter the two numbers to add:");
a=Integer.parseInt(f.readLine());
b=Integer.parseInt(f.readLine());
c = a+b;
System.out.println("\nSum of two numbers:"+ c);
}
}
 