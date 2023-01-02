import java.util.HashSet;
import java.util.Set;

public class LC1839 {

    public static void main(String[] args) {
        System.out.println(beautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
        System.out.println(beautifulSubstring("aeeeiiiioooauuuaeiou"));
        System.out.println(beautifulSubstring("a"));
    }

    //A string is considered beautiful if it satisfies the following conditions:
    //
    //Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it.
    //The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).
    //For example, strings "aeiou" and "aaaaaaeiiiioou" are considered beautiful, but "uaeio", "aeoiu", and "aaaeeeooo" are not beautiful.
    //
    //Given a string word consisting of English vowels, return the length of the longest beautiful substring of word. If no such substring exists, return 0.
    //
    //A substring is a contiguous sequence of characters in a string.
    //
    //
    //
    //Example 1:
    //
    //Input: word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
    //Output: 13
    //Explanation: The longest beautiful substring in word is "aaaaeiiiiouuu" of length 13.
    //Example 2:
    //
    //Input: word = "aeeeiiiioooauuuaeiou"
    //Output: 5
    //Explanation: The longest beautiful substring in word is "aeiou" of length 5.
    //Example 3:
    //
    //Input: word = "a"
    //Output: 0
    //Explanation: There is no beautiful substring, so return 0.
    //
    //
    //Constraints:
    //
    //1 <= word.length <= 5 * 105
    //word consists of characters 'a', 'e', 'i', 'o', and 'u'.

    public static int beautifulSubstring(String word){
        if(word.length() <5) return 0;

        int start = 0;
        int ans = 0;

        for(int i = 0;i<word.length();i++){
            if( i != 0 && word.charAt(i) < word.charAt(i-1)){
                String check = word.substring(start,i);
                if(vowelCheck(check)){
                    ans = Math.max(ans, check.length());
                }
                start = i;
            }
        }

        String secCheck = word.substring(start);
        if(vowelCheck(secCheck)){
            ans = Math.max(ans, secCheck.length());
        }
        return ans;
    }

    public static boolean vowelCheck(String check){
        Set<Character> vowels = new HashSet<>();
        for(char ch: check.toCharArray()){
            vowels.add(ch);
        }
        return vowels.size() == 5;
    }
}
