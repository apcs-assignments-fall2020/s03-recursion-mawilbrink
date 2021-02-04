public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively

    static int sum = 0;
    public static int addDigits(int x) { 
        // /10 to remove last digit 
        // %10 to extract last digit 

        if (x < 10){
            int tempSum = sum; 
            sum = 0;
            return tempSum + x;
        }
        else{
            sum += x%10;
            x = x/10;
            return(addDigits(x));
        }

    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length() <= 1){
            return true;
        }
        else{
        int length = str.length();
            if (str.charAt(0) == str.charAt(length-1)){
                str = str.substring(1, length-1);
                return isPalindrome(str);
            }
            else{
                return false;
            }
        }
        
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    static String finalAnswer = "";
    public static String reverse(String str) { 
        if(str.length()== 0){
            String tempAnswer = finalAnswer;
            finalAnswer = "";
            return tempAnswer;
        }
        else{
            char lastChar = str.charAt(str.length()-1);
            finalAnswer += lastChar;
            return(reverse(str.substring(0, str.length()-1)));

        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
