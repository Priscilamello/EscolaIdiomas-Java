package escolaidiomas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class EscolaIdiomas {
  public static void main(String[] args) {
    int op = 0;
    ArrayList<Aluno> studentsList = new ArrayList<Aluno>();
    ArrayList<Professor> teachersList = new ArrayList<Professor>();
    ArrayList<Pessoa> list = new ArrayList<Pessoa>();

    msg("========================================="
        + "\n\nBem vindo a escola de Idiomas JDialog"
        + "\n\nA melhor escolha para se aprender outro idioma !"
        + "\nVocê é novo administrador do sistema"
        + "\nRealize o cadastro de alunos e professores para nova turma !"
        + "\n\n=========================================", false);

    do {
      try {
        op = Integer.parseInt(input(buildOptions(studentsList, teachersList)));

        if (op > 2 && studentsList.size() == 0 && teachersList.size() == 0)
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

          Aluno student = new Aluno(
              firstName,
              lastName,
              "Aluno",
              Integer.parseInt(socialNumber),
              Integer.parseInt(registration),
              studentClass);

          msg("Aluno Cadastrado com sucesso !\n"
              + "Dados:\n"
              + student.getFirstName()
              + " "
              + student.getLastName()
              + " "
              + student.getStudentClass(), false);

          studentsList.add(student);
          break;

        case 2:
          String teachersName;
          teachersName = input("Digite o nome do Professor:");
          print("Professor nome: " + teachersName);

          String teachersLastName;
          teachersLastName = input("Digite o sobrenome do Professor:");
          print("Professor sobrenome: " + teachersLastName);

          String tSocialNumber;
          tSocialNumber = input("Digite o Rg: ");
          print("Rg: " + tSocialNumber);

          String teaches;
          teaches = input("Digitar a especialidade: ");
          print("Especialista em: " + teaches);

          String time;
          time = input("Digite o Turno da Aula: ");
          print("Turno: " + time);

          Professor teacher = new Professor(
              teachersName,
              teachersLastName,
              "Professor",
              Integer.parseInt(tSocialNumber),
              teaches,
              time);

          msg("Professor Cadastrado com sucesso !\n"
              + "Dados:\n"
              + teacher.getFirstName()
              + " "
              + teacher.getLastName()
              + " "
              + teacher.getTeaches(), false);

          teachersList.add(teacher);
          break;

        case 3:
          if (studentsList.size() == 0) {
            break;
          } else {
            Iterator<Aluno> alnIterator = studentsList.iterator();
            int i = 1;
            String stds = "";
            while (alnIterator.hasNext()) {
              stds += i + " - " + alnIterator.next().toString();
              i++;
            }
            msg(stds, false);
            break;
          }

        case 4:
          if (teachersList.size() == 0)
            break;
          else {
            Iterator<Professor> teachIterator = teachersList.iterator();
            int i = 1;
            String tchrs = "";
            while (teachIterator.hasNext()) {
              tchrs += i + " - " + teachIterator.next().toString();
              i++;
            }
            msg(tchrs, false);
            break;
          }

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

  private static String buildOptions(ArrayList<Aluno> students, ArrayList<Professor> teachers) {
    String options = "";
    if (students.size() == 0 && teachers.size() == 0) {
      options = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n0 - Sair";
    } else if (students.size() > 0 && teachers.size() == 0) {
      options = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Lista de alunos\n0 - Sair";
    } else if (students.size() == 0 && teachers.size() > 0) {
      options = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n4 - Lista de professorres\n0 - Sair";
    } else {
      options = "Digite o número da operação:\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Lista de alunos\n4 - Lista de professorres\n0 - Sair";
    }

    return options;
  }
}