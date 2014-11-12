/** An instance contains static methods for assignment A2 */
public class FunWithStrings {

    /* NOTE: You will have to rely on methods that are declared in class String.
     * Visit docs.oracle.com/javase/7/docs/api/java/lang/String.html, scroll
     * down to the Method Summary, and peruse the available methods.
     * Oft-used ones are charAt, length(), trim, substring, indexOf, isEmpty,
     * lastIndexOf, startsWith, endsWith, split.
     * 
     * In all these methods, you can assume that String parameters are not null. */

    /** containsOne(String s, String s2) 
     * Return true iff s contains exactly one occurrence s2
     * Precondition: Strings s and s1 are not null. 
     * 
     *  Examples: For s = "ab" and s2 = "bb", return false
     *            For s = "abbb" and s2 = "bb", return true.
     *            For s = "abbbb" and s2 = "bb", return false. 
     */
    public static boolean containsOne(String s, String s2) {
        /** Do not use a loop or recursion. Instead, look through the
         * methods of class String and see how you can tell that the first
         * and last occurrences of s2 in s are the same. Be sure you handle
         * correctly the case that s2 does not occur in s. */
    	
    	/** Thought Process
    	 * 1. Make sure there is at least 1 full sequence of s2 in s
    	 * 
    	 * 2. Make sure there are no additional sequence of s2 in s from the 
    	 * 	last index of the 1st full sequence
    	 * 
    	 */
    	int z = s.indexOf(s2),		//first index of s2 in s
    		z1 = z+s2.length(),		//last index of the 1st full sequence of s2 in s
    		z2 = s.indexOf(s2, z1); //find index of additional s2 in s after z1
    	
    	if ( z != -1 && z2 == -1) {
    		return true;
    	}
        return false;
    }

    /** fixName(String s)
     * Returns a string formatted as : Last, First
     * 
     * String s consists of a first name followed by a last name. The two names are
     * separated by 1 or more blanks. There may be blank characters at the
     * beginning of s and at the end of s. 
     * 
     * Examples: For s = "    David Gries"  return "Gries, David"
     *           For s = "Doug       James " return "James, Doug" 
     */
    
    /** Thought Process
     * 1. Trim leading and trailing white spaces in the string
     * 2. Trim white spaces between first name and last name
     * 3. Format result string with format: Last, First
     */
    public static String fixName(String s) {
        /* As you know, String is a class. An object of class String is immutable
         * --you cannot change the sequence of chars that it contains.
         * 
         * Do NOT use a loop or recursion. Use only if-statements,
         * assignments, and return statements. 
         * 
         * Finally, this method can be written using an oft-used pattern:
         *   1. Break the string into its parts
         *   2. Build the result from the parts. */
    	assert(s != null);
        String result = s.trim(),	//remove leading and trailing white spaces
        	first = result.substring(0, result.indexOf(" ")),
        	last = result.substring(result.lastIndexOf(" ")+1,result.length());
       
    	return last + ", " + first;
    }

    /** getInitials(String s)
     * Return a String containing the person's initials.
     * 
     * String s contains a person's first name, last name, and possibly a middle name
     * between them. There may be any number of blanks at the beginning and end
     * of s, but between each pair of names there is exactly one blank.
     * 
     * Examples: For s = "    David Joseph Gries" return "DJG".
     *           For s = "Doug James", return "DJ"; 
     */
    
    /** Thought Process:
     * 1. Trim all leading and trailing whitespaces
     * 2. Partition s with first, middle and/or last name strings.
     * 3. Return and capitalize the first character of each partition string
     */
    public static String getInitials(String s) {
        // Do not use a loop or recursion.
    	
    	String result = s.trim();
    	
    	/* The index pointer for the first character of each name 
    	 * points to the exact index of that string in an array
    	 * 
    	 * The index pointer for the last character of each name
    	 * points to one index above the last character in the name.
    	 * 
    	 * The lastIndex - firstIndex should give the length of the name
    	 * 
    	 * For example:
    	 * "Jason Chen" - Length: 10
    	 * firstIndex_first: 0
    	 * lastIndex_first: 5
    	 * firstIndex_last: 6
    	 * lastIndex_last: 10
    	 */
    	int lastIndex_first = result.indexOf(" "),
    			firstIndex_middle = result.lastIndexOf(" ", lastIndex_first+1)+1,
    			lastIndex_middle = result.indexOf(" ", firstIndex_middle+1),
    			firstIndex_last,
    			lastIndex_last = result.length();
    	
    	if (lastIndex_middle == -1)	
    	{	//String s does not contain a middle name
    		firstIndex_last = firstIndex_middle;
    		lastIndex_middle = firstIndex_middle;
    	}
    	else	
    	{	//String s does contain a middle name
    		firstIndex_last = result.lastIndexOf(" ", lastIndex_middle+1)+1;
    	}
    	
        String	first = result.substring(0, lastIndex_first).trim(),
        		middle = result.substring(firstIndex_middle, lastIndex_middle).trim(),
        		last = result.substring(firstIndex_last, lastIndex_last).trim();
        
        if(!middle.equals(""))		//include middle initial
        	return new StringBuilder().append(first.charAt(0)).append(middle.charAt(0)).append(last.charAt(0)).toString().toUpperCase();
        else						//ignore middle initial
        	return new StringBuilder().append(first.charAt(0)).append(last.charAt(0)).toString().toUpperCase();
    }
    
    /** replaceVowels(String s)
     * Return a string that is s but with all lowercase vowels (a, e, i, o, u)
     * replaced by asterisks *.  
     * 
     * Examples: For s = "Minecraft" return "M*n*cr*ft".
     *           For s = "Alan Turing" return "Al*n T*r*ng".
     */
    
    /** Thought Process:
     * 1. Use replace(char pattern, char replacement)
     * 2. Each replace method call should replace the specified vowel with '*'
     * 
     */
    public static String replaceVowels(String s) {
        // This can be done with five statements. No loop is required.
        // Look for a suitable String function that replaces things.
       
    	/*
    	 
    	String result = s.replace('a', '*');
    	result = result.replace('e', '*');
    	result = result.replace('i', '*');
    	result = result.replace('o', '*');		
        return result.replace('u', '*'); 
        
        */
    	return s.replace('a','*').replace('e', '*').replace('i', '*').replace('o', '*').replace('u', '*');
    }
    
    /** replaceAllVowels(String s)
     * Return a string that is s but with all lowercase and uppercase
     * vowels (a, e, i, o, u, A, E, I, O, U) replaced by asterisks *.  
     * 
     * Examples: For s = "Minecraft" return "M*n*cr*ft".
     *           For s = "Alan Turing" return "*l*n T*r*ng".
     */
    public static String replaceAllVowels(String s) {
        // Writing a long list of 10 statements is not so good. Instead, write
        // a loop that sequences through the characters in the following String
        // vowels, replacing each one in s.
        
        // A for-loop to loop through a range b..c of integers can look like this:
        //    for (int i= b; i <= c ; i= i+1) {
        //        ...
        //    }
    	
        String result = s;
    	for (int i = 0; i < s.length(); i++)
    	{
    		switch(s.charAt(i))
    		{
    			case 'a':
    			case 'A':
    			case 'e':
    			case 'E':
    			case 'i':
    			case 'I':
    			case 'o':
    			case 'O':
    			case 'u':
    			case 'U':
    				result = result.replaceFirst(String.valueOf(s.charAt(i)), "*");					
    		}
    	}
        return result;
    }
    
    /** decompress(String s)
     * Return the uncompressed version of s.
     * 
     * String s is written in a form that looks something like this: "b3c1b5x2a0".
     * For this s, we want to return the decompressed string "bbbcbbbbbxx".
     * More formally, s is in "compressed form", which means that it consists
     * of a sequence of characters that are NOT digits 0..9 with each character
     * followed by a digit; the digit indicates how many times that character
     * should appear. 
     */
    
    /** Thought Process: 
     * 1. Precondition:
     * 	 Compressed string s should simulate alphabet follow by number format.
     * 	 Consequently, even index of String s should contain alphabet only
     * 				   odd index of String s should contain number only
     * 2. Parse String s to grab alphabet content from odd index and concatenate the even index
     * 	multiplier content to the result string.
     * 
     * 
     */
    public static String decompress(String s) {
        // To produce the integer that is in String s1 use function
        // Integer.parseInt(s1). Remember that a character c is not a String,
        // and to change c into a String you may have to catenate it with the
        // empty String.
        // This function will probably need a loop within a loop
        String alphabet="", result ="";
        int multiplier;
        
        for (int i = 0; i < s.length(); i++)
        {
        	//i is even: an character
        	if (i%2 == 0)
        	{
        		alphabet = String.valueOf(s.charAt(i));
        	}
        	
        	//i is odd: multiplier character 
        	else
        	{
        		assert(Character.isDigit(s.charAt(i)));
        		multiplier = Integer.parseInt(String.valueOf(s.charAt(i)));
        		while(multiplier > 0)
        		{
        			result += alphabet;
        			multiplier--;
        		}
        	}
        }
        
        return result;
    }
}
