/******************************************************************************
 * Rule 06. Methods (MET)
 *
 * Revision History:
    //MET01-J. Never use assertions to validate method arguments Given the non-compliant code below:

    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
******************************************************************************/
public class R06_MET01_J {
    //MET01-J. Never use assertions to validate method arguments Given the non-compliant code below:

    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }

    //revised with compliant code
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
          throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
          throw new IllegalArgumentException();
        }
        return absX + absY;
      }
}
