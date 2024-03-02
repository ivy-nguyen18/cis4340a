//Rule 03. Numeric Types and Operations (NUM) 

import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    // NUM03-J. Use integer types that can fully represent the possible range of unsigned data. Given the non-compliant code below:
    public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}
}
