import java.util.*;
import java.lang.Math;

class ArmstrongNumbers {

	static boolean isArmstrongNumber(int numberToCheck) {
		
		/* Description: Method to determine whether a number is an Armstrong number. 
		An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
		
		Examples:
			
			9 is an Armstrong number, because 9 = 9^1 = 9
			10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
			153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
			154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
			
		Tests:  See /home/annblodgett/exercism/java/armstron/g-numbers/src/test/java/ArmstrongNumbersTest.java

		*/
		int numberOfDigits = 0;
		double sum =0;
		
		
		 //Count the digits in numberToCheck and store the value in a variable called numberOfDigits
            // Example: If numberToCheck was 153 then numberOfDigits would be 3
            int digitNumberToCheck = numberToCheck;
            while(digitNumberToCheck >0)
            {
                digitNumberToCheck = digitNumberToCheck/10;
                numberOfDigits = numberOfDigits +1;
            }
        
        //  Raise each digit in numberToCheck to the number numberOfDigit and sum them up and store in a variable called sum.
            //Example: If numberToCheck was 153 then  the opearation performed would be 1^3 + 5^3 + 3^3 and the number 153 would be stored in sum
            int sumNumberToCheck = numberToCheck;
            while (sumNumberToCheck > 0)
            {
                int remainder = sumNumberToCheck%10;
                sum = sum + Math.pow( remainder, numberOfDigits);
                sumNumberToCheck = sumNumberToCheck/10;
            }
			
		
		//Check to see if the value stored in sum is the same as the value stored in numberToCheck - return true to the caller if it is and false if it is not.
			// Example if numberToCheck is 153 and sum is 153  true is returned to the caller. 
		
			if (sum == numberToCheck)
			{
				return true;
			}
			else 
			{
				return false;
			}
		

}
}
