public class User {
  String fname;
  String lname;

  User(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  void show() {
    System.out.println("Hello " + this.fname + " " + this.lname);
  }
}
