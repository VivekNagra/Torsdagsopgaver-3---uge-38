class Palindrome
{
    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String reverse = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean res = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(reverse)) {
            res = true;

        }
        return res;
    }


    public static void main(String[] args)
    {
        // Input string
        String str = "Den laks skal ned";
 
        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean checkIfPal = isPalindrome(str);
        System.out.println("is " + str + " a palindrome");
        //System.out.println(reverse);
        System.out.println(checkIfPal);
    }
}



