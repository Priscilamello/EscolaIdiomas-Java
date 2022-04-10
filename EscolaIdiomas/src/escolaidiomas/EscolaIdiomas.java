package escolaidiomas;
import javax.swing.JOptionPane;
public class EscolaIdiomas {
public static void main(String[] args) {
  int op = 0;
  do {
  op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da operação:"+
  "\n1 - Cadastrar Aluno\n2 - Cadastrar Professor") );  
  switch( op )
  {
  case 1:
  String n;    
  n=JOptionPane.showInputDialog("Digite o Nome do Aluno: ");
  System.out.println("Nome: " + n);
  String s;
  s=JOptionPane.showInputDialog("Digite o Sobrenome: ");
  System.out.println("Sobrenome: " + s);
  String r;
  r=JOptionPane.showInputDialog("Digite o Rg: ");
  System.out.println("Rg: " + r);
  String m;
  m=JOptionPane.showInputDialog("Digite o código da Matrícula: ");
  System.out.println("Matrícula: " + m);
  String c;
  c=JOptionPane.showInputDialog("Digite a Classe: ");
  System.out.println("Classe: " + c);
  break;  
  case 2:
  String p;
  p=JOptionPane.showInputDialog("Digite o Nome Professor:");
  System.out.println("Professor: " + p);
  String e;
  e=JOptionPane.showInputDialog("Digitar a especialidade: ");
  System.out.println("Especialista em: " + e);
  String t;
  t=JOptionPane.showInputDialog("Digite o Turno da Aula: ");
  System.out.println("Turno: " + t);  
  break;
  case 0:
  JOptionPane.showMessageDialog(null, "Saindo do Sistema");
  }
  } while ( op!= 0 );
  } 
}