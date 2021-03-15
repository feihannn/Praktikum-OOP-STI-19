/**
 * Palindrome.java
 * Mengecheck apakah suatu kata palindrome
 * @author 18219006 Marcelino Feihan
 */
public class Palindrome {
    public boolean isStringPalindrome(String string) {
        if(string.length()==0){
            return true;
        }
        else{
            StringBuilder check=new StringBuilder(string);
            check.reverse();
            String check_string=new String(check);
            if (string.toLowerCase().equals(check_string.toLowerCase())){
                return true;
            }
            else{
                return false;
            }
        }
    }
}