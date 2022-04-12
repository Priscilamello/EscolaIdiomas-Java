package escolaidiomas;

import javax.swing.JOptionPane;

public class EscolaIdiomas {
  public static void main(String[] args) {
    int op = 0, list = 0, teachersList = 0; // provisory var list / teachesrs list.

    /**
     * TODO: implemet students and teachers list;
     */
    // String[][] scholl = new String[][];

    msg("========================================="
        + "\n\nBem vindo a escola de Idiomas JDialog"
        + "\n\nA melhor escolha para se aprender outro idioma !"
        + "\nVocê é novo administrador do sistema"
        + "\nRealize o cadastro de alunos e professores para nova turma !"
        + "\n\n=========================================", false);

    do {
      try {
        op = Integer.parseInt(input(buildOptions(list, teachersList)));

        if (op > 2 && (list == 0 || teachersList == 0))
          throw new NumberFormatException("Out of range.");

      } catch (NumberFormatException e) {
        print(e.getMessage());
        msg("Ops! Opção invalida, tente novamente !", true);
      }

      switch (op) {
        case 1:
          String firstName;
          firstName = input("Digite o Nome do Aluno: ");
          print("Nome: " + firstName);

          String lastName;
          lastName = input("Digite o Sobrenome: ");
          print("Sobrenome: " + lastName);

          String socialNumber;
          socialNumber = input("Digite o Rg: ");
          print("Rg: " + socialNumber);

          String registration;
          registration = input("Digite o código da Matrícula: ");
          print("Matrícula: " + registration);

          String studentClass;
          studentClass = input("Digite a Classe: ");
          print("Classe: " + studentClass);
          list += 1;
          break;

        case 2:
          String teachersName;
          teachersName = input("Digite o Nome Professor:");
          print("Professor: " + teachersName);

          String teaches;
          teaches = input("Digitar a especialidade: ");
          print("Especialista em: " + teaches);

          String time;
          time = input("Digite o Turno da Aula: ");
          print("Turno: " + time);
          teachersList += 1;
          break;
        case 3:
          if (list == 0)
            break;
          else
            msg("imprimir alunos matriculados", false);
            continue;
        case 4:
          if (teachersList == 0)
            break;
          else
            msg("imprimir professores matriculados", false);
            continue;
        case 0:
          int confirm = confirm("Deseja mesmo Sair ?");
          if (confirm > 0)
            op = 10;
          else
            msg("Saindo do Sistema", false);
      }
    } while (op != 0);
  }

  private static void msg(String aMessage, Boolean isWarn) {
    JOptionPane.showMessageDialog(null, aMessage, "Escola de Idiomas",
        isWarn ? JOptionPane.WARNING_MESSAGE : JOptionPane.PLAIN_MESSAGE);
  }

  private static String input(String aMessage) {
    return JOptionPane.showInputDialog(aMessage);
  }

  private static int confirm(String aMessage) {
    return JOptionPane.showConfirmDialog(null, aMessage, "Escola de Idiomoas", JOptionPane.YES_NO_OPTION);
  }

  public static void print(String aMessage) {
    System.out.println(aMessage);
  }

  private static String buildOptions(int students, int teachers) {
    String msg = "";
    if (students == 0 && teachers == 0) {
      msg = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n0 - Sair";
    } else if (students > 0 && teachers == 0) {
      msg = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Lista de alunos\n0 - Sair";
    } else if (students == 0 && teachers > 0){
      msg = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n4 - Lista de professorres\n0 - Sair";
    } else {
      msg = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Lista de alunos\n4 - Lista de professorres\n0 - Sair";
    }

    return msg;
  }
}