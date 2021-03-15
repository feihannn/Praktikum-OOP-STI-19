/**
 * Caesar.java 
 * Menchiper dengan metode Caesar
 * @author 18219006 Marcelino Feihan
 */
public class Caesar {
    /**
     * Constructor
     * @param step berapa kali huruf digeser.
     * Misalnya step = 1, artinya A -> B, C -> D
     * Misalnya step = 2, artinya A -> C, D -> F
     */
    int step;
    public Caesar(int step) {
        this.step = step;
    }

    /**
     * Encrypt -- mengenkripsi string menjadi sandi (ciphertext)
     * 
     * @param string Plain text string
     * @return ciphertext
     */
    public String encrypt(String string) {
        string.toUpperCase();
        String hasil="";
        char kata;
        for (int i=0;i<string.length();i++){
            if (isCharAlphabetic(string.charAt(i))){
                kata=shiftChar(string.charAt(i),step);
                hasil=hasil+kata;
            }
            else{
                hasil=hasil+string.charAt(i);
            }
        }
        return hasil;
    }

    /**
     * Is Char Alphabetic -- memeriksa apakah suatu karakter adalah alfabet (A-Z)
     * atau bukan.
     * 
     * @param c karakter
     * @return apakah c alfabetik
     */
    private boolean isCharAlphabetic(char c) {
        if (Character.isLetter(c)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Shift Char -- geser karakter sebanyak step langkah
     * 
     * @param c karakter A-Z huruf kapital
     * @return karakter yang sudah digeser sebanyak step
     */
    private char shiftChar(char c, int step) {
        int ascii=(int)c;
        if (ascii>90){
            ascii-=32;
        }
        ascii+=step;
        if (ascii>(int)'Z'){
            ascii-=26;
        }
        return (char)ascii;
    }
}