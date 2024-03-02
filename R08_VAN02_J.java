// Rule 08. Visibility and Atomicity (VNA)

public class R08_VAN02_J {
    //VNA02-J. Ensure that compound operations on shared variables are atomic. Given the non-compliant code below:
    final class Flag {
        private boolean flag = true;
       
        public void toggle() {  // Unsafe
          flag = !flag;
        }
       
        public boolean getFlag() { // Unsafe
          return flag;
        }
      }
    
}
