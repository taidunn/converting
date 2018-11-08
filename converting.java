public class PrimitiveTypes
{
	public static void main(String[] args)
	{
		double double1 = 89;
		System.out.println(double1);
		//Prints out the double above
		double myDouble = 33.342058023;
		/* These are variable that allows people to put in decimals.
		 * These are more precise than FLOATS.
		 * This is a 64-Bit Number with Decimals.
		 * Doesn't need to be defined by a capital "D" at the end, but it can be done if wanted.
		 */
		short myShort = -30392;
		//Can have the value from -32,768 to 32,767
		byte myByte = -28;
		//Can have a value from -28 to 127
		float myFloat = 7.14F;
		/* These are variables that allow you to put in decimals.
		 * These aren't as precise.
		 * These are 32-Bit Numbers with Decimals.
		 * MUST be defined with a capital "F" at the end of the number.
		 */
		int myInteger = 90249;
		//Can have a value from (-2)^31 to 2^31 - 1.
		long myLong = 9999994;
		//Can have a value from (-2)^63 to 2^63
		boolean myBoolean = false;
		//Can have a value of a lowercase "true" or "false".

		System.out.println ("The answer is " + myBoolean);
		//Should print "The answer is false."
		System.out.println(myShort);
		//Should print -30,392
		System.out.println((myFloat * 6) - myByte);
		//Should print 70.84
		System.out.println(myLong - (myInteger * 4));
		//Should print 9638998
	}
}
