import java.util.Scanner;
public class fibonacciSequence {
  public static void main(String[] args){

    System.out.println("Enter an integer for Fibonacci sequence.");

	Scanner userInput = new Scanner(System.in);
	int fibInteger = userInput.nextInt();

	//call the methods for both the iterative and recursive fibonacci sequence

	System.out.print("the iterativeFibonacci returns: ");
	System.out.println(fibonacciSequence.iterativeFibonacci(fibInteger));
	System.out.print("the recursiveFibonacci returns: ");
	System.out.println(fibonacciSequence.recursiveFibonacci(fibInteger));
	
	userInput.close();
  }


  static long iterativeFibonacci(long fibNth){


	if (fibNth == 0){
	  return 0;
	}
	else if (fibNth == 1) {
	  return 1;
	}

	long fibOne = 0;
	long fibTwo = 1;

	for (int i = 0; i < fibNth; i++){
	  long temp = fibOne;
	  fibOne += fibTwo;
	  fibTwo = temp;
	}

	return fibOne;
		
  }

  /* I feel that the iterative method is better than the recursive method.
  * In the iterative method, a loop is created and ran through for a certain number of
  * iterations, while the method itself is only called once.
  * The iterative and recursive function have about the same run time, at the lower
  * digits in the sequence, such as the 5th fibonacci number.
  * Therefore, when the program is run, the iterative method is more efficient, as
  * it runs faster, especially on larger numbers, like 50th in the sequence.
  */



  static long recursiveFibonacci(long fibNth){

	if (fibNth == 0){
	  return 0;
	}
	else if (fibNth == 1) {
	  return 1;
	}

	return recursiveFibonacci(fibNth - 1) + recursiveFibonacci(fibNth - 2);

  }

  /* I feel that the recursive method is worse than the iterative method.
  * In the recursive method, the method calls itself multiple times until the desired
  * result is reached, so it can be called many many times.
  * The iterative and recursive function have about the same run time, at the lower
  * digits in the sequence, such as the 5th fibonacci number.
  * Therefore, when the program is run, the recursive method is less efficient, as
  * it runs slower, especially on larger numbers, like 50th in the sequence.
  */
}