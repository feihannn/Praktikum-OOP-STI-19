/**
 * AnagramCounter.java 
 * Menghitung banyaknya kata anagram
 * @author 18219006 Marcelino Feihan
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class AnagramCounter {
    /**
     * Count Anagram 
     * - Menghitung jumlah kata yang memiliki anagram pada array yang sama
     * - Sebagai contoh, countAnagram(["buku", "kubu", "tikus"]) = 2
     */
    public static int countAnagram(ArrayList<String> arr) {
        int count=0;
        ArrayList<String>temp=toSortedString(arr);
        HashMap<String,Integer> temp2=countOccurences(temp);
        for(Map.Entry<String,Integer> i: temp2.entrySet()){
            if(i.getValue()>1){
                count+=i.getValue();
            }
        }
        return count;
    }

    /**
     * (Array of String) to (Array of) Sorted String 
     * - Mengembalikan ArrayList dengan String yang di-sort lexicographically
     * - Sebagai contoh, toSortedString(["buku", "kubu", "tikus"]) = ["bkuu", "bkuu", "ikstu"]
     */
    public static ArrayList<String> toSortedString(ArrayList<String> arr) {
        // TODO lengkapi
        char temp[];
        String temp2;
        ArrayList<String> hasil=new ArrayList<String>();
        for (int i=0;i<arr.size();i++){
            temp=arr.get(i).toCharArray();
            Arrays.sort(temp);
            temp2=new String(temp);
            hasil.add(temp2);
        }
        return hasil;
    }

    /**
     * Count Occurences
     * - Mengembalikan HashMap berisi kemunculan dari tiap String pada ArrayList
     * - Sebagai contoh, countOccurences(["bkuu", "bkuu", "ikstu"]) = <bkuu=2, ikstu=1>
     */
    public static HashMap<String, Integer> countOccurences(ArrayList<String> arr) {
        // TODO lengkapi
        HashMap<String,Integer> hasil=new HashMap<String,Integer>();
        for(int i=0;i<arr.size();i++){
            int count=0;
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j)!=null&&arr.get(i)!=null){
                    if(arr.get(i).equals(arr.get(j))){
                        count++;
                        arr.set(j, null);
                    }
                }   
            }
            if(arr.get(i)!=null){
                count++;
                hasil.put(arr.get(i),count);
            }
        }
        return hasil;
    }
}