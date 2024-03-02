// Rule 13. Input Output (FIO)

public class R13_FIO09_J{
    // FIO09-J. Do not rely on the write() method to output integers outside the range 0 to 255. Given the non-compliant code below:
    class ConsoleWrite {
        public static void main(String[] args) {
          // Any input value > 255 will result in unexpected output
          System.out.write(Integer.valueOf(args[0]));
          System.out.flush();
        }
      } 
}
