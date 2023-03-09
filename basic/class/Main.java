import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String fname = scanner.nextLine();
    String lname = scanner.nextLine();
    User obj = new User(fname, lname);

    obj.show();

    scanner.close();
  }
}
