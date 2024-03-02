/******************************************************************************
 * Rule 01. Declarations and Initialization (DCL)
 *
 * Revision History:
   //DCL00-J. Prevent class initialization cycles.  Given the non-compliant code below:
    public class Cycle {
        private final int balance;
        private static final Cycle c = new Cycle();
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
       
        public Cycle() {
          balance = deposit - 10; // Subtract processing fee
        }
       
        public static void main(String[] args) {
          System.out.println("The account balance is: " + c.balance);
        }
      }
******************************************************************************/
public class R01_DCL00_J {
    //DCL00-J. Prevent class initialization cycles.  Given the non-compliant code below:
    public class Cycle {
        private final int balance;
        private static final Cycle c = new Cycle();
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
       
        public Cycle() {
          balance = deposit - 10; // Subtract processing fee
        }
       
        public static void main(String[] args) {
          System.out.println("The account balance is: " + c.balance);
        }
      }
    
    //Revised with compliant code
    public class Cycle {
        private final int balance;
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
        private static final Cycle c = new Cycle();  // Inserted after initialization of required fields
        public Cycle() {
          balance = deposit - 10; // Subtract processing fee
        }
       
        public static void main(String[] args) {
          System.out.println("The account balance is: " + c.balance);
        }
      }
}
