/******************************************************************************
 * Rule 04. Characters and Strings (STR) 
 *
 * Revision History:
    //STR03-J. Do not encode noncharacter data as a string Given the non-compliant code below:
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray); 
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
******************************************************************************/

import java.math.BigInteger;

public class R04_STR03_J {
    //Revised with compliant code
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray); 
    x = new BigInteger(ns);
}
