package day5;

public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//NOTE: Throwable  is parent of all exceptions

//1. Compile time/Checked  exception: ex: syntax exception and IOException, SQLException, etc...
//Class which inherit directly Exception class.
//2. Run time/Unchecked  exception: ex:  ArrayIndexOutOfBoundsException, NullPointerException, etc..
//Class which inherits RuntimeException class.
//3. Error: ex: No nw connectivity, storage full, stack memory full...

//Compile-> javac ExceptionHandling.java
//Execution-> java ExceptionHandling
//Throwable
//|-> Exception
//      |-> IOException
//      |-> SQLException
//      |-> FileNotFoundException
//      |-> RuntimeException
//                 |-> ArithmeticException
//                 |-> ArrayIndexOutOfBoundsException
  public static void main(String[] args) {
      System.out.println("This is msg: One");
      int a = 10;
      Scanner sc = new Scanner(System.in);
      int[] arr = {10, 20};
      try {
          System.out.println("1");
          int sum = a / 0;
          System.out.println("2");
          System.out.println(arr[5]);
          System.out.println("3");
      } catch (NullPointerException math) {
          System.out.println(math);
      } catch (ArithmeticException math) {
          System.out.println(math);
      } catch (ArrayIndexOutOfBoundsException math) {
          System.out.println(math);
      } finally {
          sc.close();
          System.out.println("This is finally block");
      }
      System.out.println("This is msg: Two");
  }
}