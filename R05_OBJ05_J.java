/******************************************************************************
 * Rule 05. Object Orientation (OBJ)
 *
 * Revision History:
    // OBJ05-J. Do not return references to private mutable class members
    class MutableClass {
        private Date d;
       
        public MutableClass() {
          d = new Date();
        }
       
        public Date getDate() {
          return d;
    }
******************************************************************************/

// OBJ05-J. Do not return references to private mutable class members

class MutableClass {
  private Date d;

  public MutableClass() {
    d = new Date();
  }

  public Date getDate() {
    return d;
  }
}

// Revised with compliant code
public Date getDate() {
  return (Date)d.clone();
}

