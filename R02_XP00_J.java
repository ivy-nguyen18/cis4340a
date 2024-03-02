/******************************************************************************
 * Rule 02. Expressions (EXP)
 *
 * Revision History:
    //This noncompliant code example attempts to delete a file but fails to check whether the operation has succeeded:
    public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
    }
******************************************************************************/
import java.io.File;

public class R02_XP00_J {
    //Revised with compliant code
    public void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
          // Handle failure to delete the file
        }
       
      }
}
