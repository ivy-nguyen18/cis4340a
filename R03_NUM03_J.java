
/******************************************************************************
 * Rule 03. Numeric Types and Operations (NUM) 
 *
 * Revision History:
    // NUM03-J. Use integer types that can fully represent the possible range of unsigned data. Given the non-compliant code below:
    public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
    }
******************************************************************************/

// NUM03-J. Use integer types that can fully represent the possible range of unsigned data. Given the non-compliant code below:
public static int getInteger(DataInputStream is) throws IOException {

  return is.readInt(); 
  }

// Revised with compliant code
public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}


