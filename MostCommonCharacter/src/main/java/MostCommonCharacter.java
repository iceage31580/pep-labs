import java.util.HashMap;
import java.util.Map; 


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>(); 
        int maxCount = 0; 
        char mostCommon = ' '; 

        for(char c : str.toCharArray())
        {
            int count = charCount.getOrDefault(c, 0) +1;
            charCount.put(c, count); 
            if(count > maxCount)
            {
                maxCount = count; 
                mostCommon = c; 
            } 
        }
        return mostCommon; 
    }
}
