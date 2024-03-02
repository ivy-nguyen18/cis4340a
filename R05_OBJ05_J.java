// Rule 05. Object Orientation (OBJ)
public class R05_OBJ05_J {
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
}
