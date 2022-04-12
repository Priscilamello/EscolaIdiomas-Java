package escolaidiomas;

public class Professor extends Pessoa {
  private String teaches;
  private String time;

  public Professor(String firstName, String lastName, String occupation,
      int registrationNumber, String teaches, String time) {
    super(firstName, lastName, occupation, registrationNumber);
    this.teaches = teaches;
    this.time    = time;
  }

  public Professor() {
  }

  public String getTeaches() {
      return teaches;
  }

  public String getTime() {
      return time;
  }

  @Override
  public String toString() {
      return super.toString()
       + " Leciona: "
       + this.getTeaches()
       + " | Periodo: "
       + this.getTime()
       + "\n";
  }
}