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

    int doubleToInt = (int) myDouble;
    System.out.println(doubleToInt);
    /*Should return with a "33" it will remove all the decimals because
    *integers dont have any decimals.
    */
    short bytetoShort = (short) myByte;
    System.out.println(bytetoShort);
    //Should return -28

    //For the rest use (long) (float) (byte) (double)
    /*When certain ones are changed to non-decimal PrimitiveTypes then
    *anything after thedecmal will be removed
    */
	}
}
