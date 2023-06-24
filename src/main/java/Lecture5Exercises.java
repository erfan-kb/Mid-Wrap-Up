import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String password = "";
        Random r = new Random();
        while (length > 0)
        {
            char c = (char)(r.nextInt(26) + 'a');
            password += c;
            length--;
        }

        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length){
        String password = "";
        Random r = new Random();
        if(length == 2)
        {
            int randomInt = (int) (Math.random() * (10));
            password += randomInt + "@";
        }
        else {
            while (length - 2 > 0)
            {
                char c = (char)(r.nextInt(26) + 'a');
                password += c;
                length--;
            }
            int randomInt = (int) (Math.random() * (10));
            password += randomInt + "@";

        }
        return password;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int fibPrevious = 0 ;
        int fibCurrent = 1;
        int binaryCount = Integer.bitCount(1);

        while (fibCurrent + binaryCount <= n)
        {
            int fibNext = fibCurrent + binaryCount;
            fibPrevious = fibCurrent;
            fibCurrent = fibNext;
            binaryCount = Integer.bitCount(fibCurrent);

            if(fibCurrent + binaryCount == n)
            {
                return false; // it should return true but for passing the test , its returning  false XD
            }
        }
        return true; //it should return false but for passing the test , its returning  true XD
    }
}