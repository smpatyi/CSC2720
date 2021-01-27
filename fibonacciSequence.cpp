#include <iostream>
using namespace std;


long recursiveFibonacci(int fibN){
    if (fibN == 0) {
        return 0;
    }
    else if (fibN == 1){
        return 1;
    }
    return recursiveFibonacci(fibN-1) + recursiveFibonacci(fibN-2);
}

    /* I feel that the recursive method is worse than the iterative method.
    * In the recursive method, the method calls itself multiple times until the desired
    * result is reached, so it can be called many many times.
    * The iterative and recursive function have about the same run time, at the lower
    * digits in the sequence, such as the 5th fibonacci number.
    * Therefore, when the program is run, the recursive method is less efficient, as
    * it runs slower, especially on larger numbers, like 50th in the sequence.
    */

long iterativeFibonacci(int fibN) {
    if (fibN == 0) {
        return 0;
    }
    else if (fibN == 1){
        return 1;
    }

    long fibOne = 0, fibTwo = 1, fibAdder;
    for (int counter = 0; counter < fibN; counter ++) {
        fibAdder = fibOne + fibTwo;
        fibOne = fibTwo;
        fibTwo = fibAdder;
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

   

int main(void) {
    int fibIndex;
    cout << "Please enter a nonnegative integer as the index for a fibonacci number. " ;
    cin >> fibIndex ;
    cout << "The number inputted is " << fibIndex << "." << endl;

    cout << "recursiveFibonacci[" << fibIndex << "] = " << recursiveFibonacci(fibIndex) << endl;
    cout << "iterativeFibonacci[" << fibIndex << "] = " << iterativeFibonacci(fibIndex) << endl;
}