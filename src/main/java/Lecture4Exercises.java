public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int temp = n;
        long result = 1;
        while (temp >0)
        {
            result*= temp;
            temp--;
        }
        return result;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String temp = "";
        for (int i = word.length(); i > 0; i--) {
            temp += word.substring(i-1,i);
        }

        return temp;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.toLowerCase();
        line = line.replaceAll(" ","");

        String temp = "";
        for (int i = line.length(); i > 0; i--) {
            temp += line.substring(i-1,i);
        }

        if(temp.equals(line))
        {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] table = new char[str1.length()][str2.length()];

        for(int i = 0; i < str1.length();i++)
        {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.substring(i,i+1).equals(str2.substring(j,j+1)))
                {
                    table[i][j]= '*';
                }
                else {
                    table[i][j] = ' ';
                }
            }
        }
        return table;

    }
}