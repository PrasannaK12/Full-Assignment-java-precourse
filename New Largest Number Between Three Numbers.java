import java.util.*;

public class GreatestNumber
{

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if( a >= b && a >= c)
    {
      System.out.print("The Largest Number is :" +a);
    }
    else if( b >= a && b >= c)
    {
      System.out.print("The Largest Number is :" +b);
    }
    else
{
  System.out.print("The Largest Number is :" +c);
}
}
}