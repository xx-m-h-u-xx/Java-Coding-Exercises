public class StringUtils
{
	public static String Reverse( String s )
	{
		// converts between String & StringBuffer
		StringBuffer reversed = new StringBuffer(s);
		
		// reverses string using for-loop
		for(int i = 0; i < s.length(); i++) {
			// retrieves character at i and the length of s - 1 minus i
			reversed.setCharAt (i, s.charAt(s.length()- 1 - i));
		}
		
		/* for (int i = s.length()-1 ; i >= 0 ; i--) {
			reversed.append(s.charAt(i) );
		} */
		
		// return a new string, which is the String s, reversed
		return new String(reversed);
	}

	public static String ToLower( String s )
	{
		// return a new string, which is the same as s, but
		// all upper-case alphabetical characters are replaced by their
		// lower-case equivalents
		
		StringBuffer lower = new StringBuffer(s);
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z' ) {
				// upper case letter
				c = (char)(c + 'a' - 'A');
				lower.setCharAt(i, c);
			}
		}
		
		return new String(lower);
	}

	public static boolean Equals( String s1, String s2 )
	{
		/* return true if s1 and s2 contain the same characters */
		
		// if the length of both strings doesn't equal return false
		if(s1.length() != s2.length() )
			return false;
		
		// checks each character in loop
		for(int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i));
			return false;
		}
		
		return true;
	}
	
	public static boolean IsPalindrome( String s )
	{
		// return true if s reads the same forwards and backwards, ignoring case
		return (Equals(ToLower(s), ToLower(Reverse(s)) ));
		
	}
}
