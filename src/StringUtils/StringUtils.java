package StringUtils;

import java.util.*;

public class StringUtils {

    public static int countVowels(String str){
        if(str == null)
            return 0;

        int count = 0;
        String vowels = "aeiou"; // could have used Set<Character> here
        for (var ch :
                str.toCharArray()) {
            if(vowels.contains(Character.toString(ch).toLowerCase()))
                count++;
        }

        return count;
    }

    public static String reverse(String str){
        if(str == null)
            return "";

        // String reversed = "";
        StringBuilder reversed = new StringBuilder(); // better use stringBuilder

        for (int i = str.length() - 1; i >= 0; i--) {  //O(n)
            // reversed += str.charAt(i);  //O(n) - because string is immutable;
                                            // the string needed to rebuild itself in every updates
            reversed.append(str.charAt(i)); // O(1)
        }

        return reversed.toString();
    }

    public static String reverseWords(String sentences){
        var words = sentences.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

/*        StringBuilder reversed = new StringBuilder();

        for (int i = words.length; i >= 0; i--) {
            reversed.append(words[i] + " ");
        }

        return reversed.toString().trim();*/
    }

    public static boolean areRotation(String str1, String str2){
        if(str1 == null || str2 == null) return false;
        // ABCDABCD
        return str1.length() == str2.length() && (str1 + str1).contains(str2);

    }

    public static String removeDuplicates(String str){
        if(str == null) return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for(var ch : str.toCharArray()){
            if(!seen.contains(ch)){
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static char getMaxOccurringChar(String str){
/*        Map<Character, Integer> frequencies = new HashMap<>();

        for (var ch : str.toCharArray()) {
            if(frequencies.containsKey(ch))
                frequencies.replace(ch, frequencies.get(ch) + 1);
            else
                frequencies.put(ch, 1);
        }*/

        // Use ASCII
        if(str.isEmpty() || str == null)
            throw new IllegalArgumentException();

        int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (var ch :
                str.toCharArray())
            frequencies[ch]++;

        int max = 0;
        char result = ' ';

        for (int i = 0; i < frequencies.length; i++)
            if(frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }

        return result;
    }

    public static String capitalize(String sentence){
        if(sentence.trim().isEmpty() || sentence == null)
            return "";

        String[] words = sentence.trim()
                .replaceAll(" +", " ").split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    // O(nlog(n))
    public static boolean areAnagrams(String first , String second){
        if(first == null || second == null ||
            first.length() != second.length())  // if both string lengths are different, no comparison is needed.
            return false;

        // For Case insensitive comparison
        // O(n)
        var array1 = first.toLowerCase().toCharArray();
        // O(nlog(n))
        Arrays.sort(array1);

        // same as above O(n)
        var array2 = second.toLowerCase().toCharArray();
        // O(nlog(n))
        Arrays.sort(array1);

        return Arrays.equals(array1, array2);
    }

    // O(n)
    public static boolean areAnagram2(String first, String second){
        if(first == null || second == null)
            return false;

        final int ENGLISH_ALPHAEBET =26;
        int[] frequencies = new int[ENGLISH_ALPHAEBET];

        first = first.toLowerCase();
        //O(n)
        for (int i = 0; i <frequencies.length; i++) {
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();
        //O(n)
        for (int i = 0; i < second.length(); i++) {
            int index = second.charAt(i) - 'a';
            if(frequencies[index] == 0)
                return false;
            frequencies[index]--;
        }

        return true;
    }

    // ABBA
    // This is case-sensitive
    public static boolean isPalindrom(String word){
/*        var input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);*/

        int left = 0;
        int right = word.length() - 1;

        while(left < right)
            if(word.charAt(left++) != word.charAt(right++))
                return false;

        return true;
    }

}
