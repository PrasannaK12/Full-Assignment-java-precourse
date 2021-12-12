import java.util.*;


 class Square
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=1; i<a/2; i++)
    {
      if(a==i*i)
      {
        System.out.print("Number is perfect Square");
      return;
      }
      }
  System.out.print("Number is not perfect Square");
    }
    }
    