public class Main
{
	public static void main( String args[] )
	{
		// some tests of Reverse method:
		String[] testCases = {"abcd", "ABCD", "-$%$", "", "Abba" };
	    for ( int i = 0; i < testCases.length; i++ )
		{
			System.out.println("Reverse of "+testCases[i]+" is "+StringUtils.Reverse(testCases[i]));
		}

		// some tests of ToLower method:
	    for ( int i = 0; i < testCases.length; i++ )
		{
			System.out.println("ToLower of "+testCases[i]+" is "+StringUtils.ToLower(testCases[i]));
		}

		// some test of Equals method :
		String s1, s2;
		s1 = "asdfg"; s2 = "";
		System.out.println("Equals of: " + s1 + " = " + s2 + "? " + StringUtils.Equals(s1,s2));
		s1 = "asdfg"; s2 = "ASDFG";
		System.out.println("Equals of: " + s1 + " = " + s2 + "? " + StringUtils.Equals(s1,s2));
		s1 = "qwerty!£$%"; s2 = "qwerty!£$%";
		System.out.println("Equals of: " + s1 + " = " + s2 + "? " + StringUtils.Equals(s1,s2));
		s1 = ""; s2 = "";
		System.out.println("Equals of: " + s1 + " = " + s2 + "? " + StringUtils.Equals(s1,s2));

		// some tests of boolean IsPalindrome:
	    for ( int i = 0; i < testCases.length; i++ )
		{
			System.out.println("Palindrome: "+testCases[i]+" is "+StringUtils.IsPalindrome(testCases[i]));
		}
	}
}
