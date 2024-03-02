//Rule 02. Expressions (EXP)

import java.io.File;

public class R02_XP00_J {
    //XP00-J. Do not ignore values returned by methods Given the non-compliant code below:
    public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
    }
}
