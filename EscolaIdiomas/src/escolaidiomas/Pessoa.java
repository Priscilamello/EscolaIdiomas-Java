package escolaidiomas;

public class Pessoa {
  public String nome;
  public String sobreNome;
  public String professor;
  public int rg;

  public Pessoa(String nome, String sobreNome, String ultimoNome, int rg) {
    this.nome = nome;
    this.sobreNome = sobreNome;
  }

  public Pessoa() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobreNome() {
    return sobreNome;
  }

  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }

  public String getProfessor(String professor) {
    return professor;
  }

  public void setProfessor(String professor) {
    this.professor = professor;
  }

  public int getRg() {
    return rg;
  }

  public void setRg(int rg) {
    this.rg = rg;
  }
}