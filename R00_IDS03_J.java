//Rule 00. Input Validation and Data Sanitization (IDS)
public class R00_IDS03_J {
    //IDS03-J. Do not log unsanitized user input Given the non-compliant code below:
    if (loginSuccessful){
        logger.severe("User login succeeded for: " + username);
    } else {
        logger.severe("User login failed for: " + username);
    }
}
