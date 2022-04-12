package escolaidiomas;

public class Aluno extends Pessoa {
  private int registration;
  private String studentClass;

  public Aluno(String firstName, String lastName, String occupation,
      int registrationNumber, int registration, String studentClass) {
    super(firstName, lastName, occupation, registrationNumber);
    this.registration = registration;
    this.studentClass = studentClass;
  }

  public Aluno() {
  }

  public int getRegistration() {
      return registration;
  }

  public String getStudentClass() {
      return studentClass;
  }

  public void setRegistration(int registration) {
      this.registration = registration;
  }

  public void setStudentClass(String studentClass) {
      this.studentClass = studentClass;
  }
}