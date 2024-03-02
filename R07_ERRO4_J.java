//Rule 07. Exceptional Behavior (ERR)
public class R07_ERRO4_J {
    // ERR04-J. Do not complete abruptly from a finally block.  Given the non-compliant code below:
    class TryFinally {
        private static boolean doLogic() {
          try {
            throw new IllegalStateException();
          } finally {
            System.out.println("logic done");
            return true;
          }
        }
      }
}
