/******************************************************************************
 * Rule 02. Expressions (EXP)
 *
 * Revision History:
    //XP00-J. Do not ignore values returned by methods Given the non-compliant code below:
    public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
    }
******************************************************************************/
import java.io.File;

public class R02_XP00_J {
    //XP00-J. Do not ignore values returned by methods Given the non-compliant code below:
    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
        }

    //Revised with compliant code
    public void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
          // Handle failure to delete the file
        }
       
      }
}
