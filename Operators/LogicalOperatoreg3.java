 class LogicalOperatoreg3 {
public static void main(String[] args)
{
   int a, b, exp = 10;
    a = b = 5;
   exp = ++a * 10 / b++ + --a;
   System.out.println("exp = " +exp); //17
  }
}