import java.util.Scanner;

public class Email {
  //properties as variables
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String alternativeEmail;
  private int defaultPasswordLength = 8;
  private int mailBoxCapacity;

  //constructor to receive first and lastName
  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    //System.out.println("Email created: " + this.firstName + " " + this.lastName);
    //call a method asking for the department which is gonna return the department
    this.department = setDepartment();
    System.out.println("Your department is " + department);
    //call a method that returns a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is " + password);
  }

  //ask for the department
  private String setDepartment(){
    System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none ");
    System.out.println("Enter your department code: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if(depChoice == 1) return "Sales";
    else if(depChoice == 2) return "Dev";
    else if(depChoice == 3) return "Accounting";
    else return "";
  }
  //generate random password
  private String randomPassword(int length){
    String passwordSet = "ABCDEFGHILMNOPQRSTUVZ1234567890@£$%&*?!";
    char[] charPassword = new char[length];
    for(int i = 0; i < length; i++){
      int random = (int) (Math.random() * passwordSet.length());
      charPassword[i] = passwordSet.charAt(random);
    }
    return new String(charPassword);
  }

  //set mail box capacity

  //set alternative email

  //change password

  //here we create the objects
}
