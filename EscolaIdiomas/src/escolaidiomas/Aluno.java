package escolaidiomas;
public class Aluno extends Pessoa {
  public int matricula;
  public String classe; 
  public Aluno(int matricula, String classe,
  String nome, String sobreNome) {
  this.matricula = matricula;
  this.classe = classe;  
  }
  public Aluno() {
  }
  public int getMatricula() {
  return matricula;
  }
  public void setMatricula(int matricula) {
  this.matricula = matricula;
  }
  public String getClasse() {
  return classe;
  }
  public void setClasse(String classe) {
  this.classe = classe;
  }  
  @Override
  public String toString (){
  return super.toString()+
  "\nNumero de Matricula: " + this.getMatricula() +
  "\nClasse: " + this.getClasse();
  }
} 