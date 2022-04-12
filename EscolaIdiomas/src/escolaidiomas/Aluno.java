package escolaidiomas;

public class Aluno extends Pessoa {
  public int registration;
  public String studentClass;

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
}