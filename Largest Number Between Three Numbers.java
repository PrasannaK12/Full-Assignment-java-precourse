public class greatestnumber
{

  public static void main(String args[]) {

      int num1 = 30, num2 = 40, num3 = 50;

      if(num1 >= num2 && num1 >= num3)
          System.out.println("num1 is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println("num2 is the largest Number");

      else
          System.out.println("num3 is the largest Number");
  }
}