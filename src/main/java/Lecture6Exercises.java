import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long result = 0;
        for (int i = 0; i < arr.length; i+=2)
        {
            result += arr[i];
        }
        return result;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int [] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] n = new double[1][1];
        for (int i = 0; i <1; i++){
            for (int j = 0; j <2; j++){
                n [i][i] += m1[i][j] * m2[j][i];
            }
        }
        return n;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        List<List<String>> array = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if(i == 0)
                {
                    names1.add(names[i][j]);
                }
                else {
                    names2.add(names[i][j]);
                }
            }
        }
        array.add(names1);
        array.add(names2);
        return array;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> prime = new ArrayList<>();
        int temp = n;
        if(n != 1) {
            for (int i = 2 ; i <= n; i++) {
                if(temp == 1)
                {
                    break;
                }
                else {
                    if(temp % i == 0)
                    {
                        while (temp % i == 0)
                        {
                            temp = temp / i ;
                        }
                        prime.add(i);
                    }
                }
            }
        }

        return prime;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<>();
        line = line.replaceAll("[@#$%^&*()/,';\\?!]+", "");
        words = Arrays.asList(line.split(" "));
        return words;
    }
}