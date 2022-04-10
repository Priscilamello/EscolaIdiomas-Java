package escolaidiomas;
public class Professor extends Pessoa {
  public String especialidade;
  public String turno;   
  public Professor(String especialidade) {
  this.especialidade = especialidade;
  }
  public Professor() {
  }
  public String getEspecialidade() {
  return especialidade;
  }
  public void setEspecialidade(String especialidade) {
  this.especialidade = especialidade;
  }
  public String getTurno() {
  return turno;
  }
  public void setTurno (String turno) {
  this.turno = turno;
  }   
   @Override
  public String toString (){
  return super.toString()+
  "\nMateria lecionada: "+this.getEspecialidade() +
  "\nSalário: "+this.getTurno();
    
  }

}