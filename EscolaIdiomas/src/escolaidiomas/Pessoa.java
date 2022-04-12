package escolaidiomas;

public class Pessoa {
  protected String firstName;
  protected String lastName;
  protected String occupation;
  protected int registrationNumber;

  public Pessoa(String firstName, String lastName, String occupation, int registrationNumber) {
    this.firstName          = firstName;
    this.lastName           = lastName;
    this.occupation         = occupation;
    this.registrationNumber = registrationNumber;
  }

  public Pessoa() {
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getOccupation() {
    return occupation;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }
}