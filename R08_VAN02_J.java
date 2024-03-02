/******************************************************************************
 * Rule 08. Visibility and Atomicity (VNA)
 *
 * Revision History:
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
******************************************************************************/

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


//Revised with compliant code:
final class Flag {
  private boolean flag = true;

  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }

  public synchronized boolean getFlag() {
    return flag;
  }
}

