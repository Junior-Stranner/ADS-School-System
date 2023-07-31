import java.util.ArrayList;
import java.util.Scanner;


public class SistemaPrincipal {
   private static ArrayList<Aluno> alunos = new ArrayList<>();
   private static ArrayList<Aluno> alunosAprovados = new ArrayList<>();
   private static ArrayList<Aluno> alunosReprovados = new ArrayList<>();
   private static ArrayList<Aluno> alunosRecuperacao = new ArrayList<>();
   private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
       
        int op = 0;

try {

      while(op != 9){
            System.out.println("================"
            +"\n Menu "
            +"\n 1 - Cadastrar Aluno "
            +"\n 2 - Calcula a Média"
            +"\n 3 - Mostrar Cadastro "
            +"\n 4 - Visualizar o Resultado do ALuno"
            +"\n 5 - alterar dados so Curso");
          op = Integer.parseInt(in.nextLine());

           switch(op){
            case 1: cadastrarAluno();break;
            case 2: calculaMedia();break;
            case 3: mostraDadosCadastrados();break;
            case 4: resultadoAluno();break;
            case 5: alteraDadosCurso();break;

           }
        }
    
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
    System.out.println("Erro ao executar o Menu");
}
      
    }

    private static void alteraDadosCurso() {

        System.out.println("Altera Dados "
        +"\n 1 - alterar Disciplina "
        +"\n 2 - alterar notas"
        +"\n======================");
        int op = Integer.parseInt(in.nextLine());

      

        for (Aluno aluno : alunos) {
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                
             switch(op){

                case 1: System.out.println("Alterar Disciplina");
                System.out.println("Escolha uma das Disciplinas a seguir para a Troca"
                +"\n 1 - C# "
                +"\n 2 - C++ "
                +"\n 3 - Kotlin"
                +"\n 4 - MySQL ");
                int altDisciplina = Integer.parseInt(in.nextLine());

                switch(altDisciplina){

                    case 1: System.out.println("Escolha C# "
                    +"\n Gostaria de substituir qual das seguintes Disciplina");
                    System.out.println(" 1 - "+disciplina.getDisciplina1()
                    +"\n 2 - "+disciplina.getDisciplina2()
                    +"\n 3 - "+disciplina.getDisciplina3());
                   int novaDisciplina = Integer.parseInt(in.nextLine());

                   if(novaDisciplina == 1){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina1()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma1 = Integer.parseInt(in.nextLine());

                      if(confirma1 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova1 = "C#";
                          disciplina.setDisciplina1(DiscNova1);

                      }else {
                        break;
                      }


                    if(novaDisciplina == 2){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina2()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma2 = Integer.parseInt(in.nextLine());

                      if(confirma2 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova2 = "C#";
                          disciplina.setDisciplina2(DiscNova2);
                          
                      }else {
                        break;
                      }

                    if(novaDisciplina == 3){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina3()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma3 = Integer.parseInt(in.nextLine());

                      if(confirma3 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova3 = "C#";
                          disciplina.setDisciplina3(DiscNova3);
                      }else {
                        break;
                      }
                   }
                }
              }
              
                    case 2: System.out.println("Escolha C++ "
                    +"\n Gostaria de substituir qual das seguintes Disciplina");
                    System.out.println(" 1 - "+disciplina.getDisciplina1()
                    +"\n 2 - "+disciplina.getDisciplina2()
                    +"\n 3 - "+disciplina.getDisciplina3());
                   int novaDisciplina2 = Integer.parseInt(in.nextLine());

                   if(novaDisciplina2 == 1){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina1()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma1 = Integer.parseInt(in.nextLine());

                      if(confirma1 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova1 = "C++";
                          disciplina.setDisciplina1(DiscNova1);

                      }else {
                        break;
                      }

                    if(novaDisciplina2 == 2){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina2()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma2 = Integer.parseInt(in.nextLine());

                      if(confirma2 == 1){
                          System.out.println("Alteração concluida");
                            String DiscNova2 = "C++";
                          disciplina.setDisciplina2(DiscNova2);
                          
                      }else {
                        break;
                      }
              
                    if(novaDisciplina2 == 3){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina3()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma3 = Integer.parseInt(in.nextLine());

                      if(confirma3 == 1){
                        System.out.println("Alteração concluida");
                         String DiscNova3 = "C++";
                        disciplina.setDisciplina3(DiscNova3);
                      }else {
                        break;
                      }
                    }
                 }
              }
              /* */
              
                    case 3: System.out.println("Escolha Kotlin"
                    +"\n Gostaria de substituir qual das seguintes Disciplina");
                    System.out.println(" 1 - "+disciplina.getDisciplina1()
                    +"\n 2 - "+disciplina.getDisciplina2()
                    +"\n 3 - "+disciplina.getDisciplina3());
                   int novaDisciplina3 = Integer.parseInt(in.nextLine());

                   if(novaDisciplina3 == 1){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina1()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma1 = Integer.parseInt(in.nextLine());

                      if(confirma1 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova1 = "Kotlin";
                          disciplina.setDisciplina1(DiscNova1);

                      }else {
                        break;
                      }

                    if(novaDisciplina3 == 2){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina2()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma2 = Integer.parseInt(in.nextLine());

                      if(confirma2 == 1){
                          System.out.println("Alteração concluida");
                            String DiscNova2 = "Kotlin";
                          disciplina.setDisciplina2(DiscNova2);
                          
                      }else {
                        break;
                      }

                    if(novaDisciplina3 == 3){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina3()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma3 = Integer.parseInt(in.nextLine());

                      if(confirma3 == 1){
                        System.out.println("Alteração concluida");
                         String DiscNova3 = "Kotlin";
                        disciplina.setDisciplina3(DiscNova3);
                      }else {
                        break;
                      }
                    }
                 }
              }
              /* */
                 case 4: System.out.println("Escolha MYSql"
                    +"\n Gostaria de substituir qual das seguintes Disciplina");
                    System.out.println(" 1 - "+disciplina.getDisciplina1()
                    +"\n 2 - "+disciplina.getDisciplina2()
                    +"\n 3 - "+disciplina.getDisciplina3());
                   int novaDisciplina4 = Integer.parseInt(in.nextLine());

                   if(novaDisciplina4 == 1){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina1()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma1 = Integer.parseInt(in.nextLine());

                      if(confirma1 == 1){
                          System.out.println("Alteração concluida");
                          String DiscNova1 = "MYSql";
                          disciplina.setDisciplina1(DiscNova1);

                      }else {
                        break;
                      }
                    
                    if(novaDisciplina4 == 2){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina2()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma2 = Integer.parseInt(in.nextLine());

                      if(confirma2 == 1){
                          System.out.println("Alteração concluida");
                            String DiscNova2 = "MYSql";
                          disciplina.setDisciplina2(DiscNova2);
                          
                      }else {
                        break;
                      }

                    if(novaDisciplina4 == 3){
                      System.out.println("Você irá substituir a Disciplina "+disciplina.getDisciplina3()
                      +"\n deseja continuar ? "
                      +"\n 1 - Sim "
                      +"\n 2 - Não ");
                      int confirma3 = Integer.parseInt(in.nextLine());

                      if(confirma3 == 1){
                        System.out.println("Alteração concluida");
                         String DiscNova3 = "MYSql";
                        disciplina.setDisciplina3(DiscNova3);
                      }else {
                        break;
                      }
                      break;
                }
              }
             
            }
          }

          case 2:System.out.println("Alterar Notas ");
          System.out.println("Escolha as notas a seguir que vc queira "
          +"\n 1 - Notas da Disciplina 1"
          +"\n 2 - Notas da Disciplina 2"
          +"\n 3 - Notas da Disciplina 3");
          int opNotas = Integer.parseInt(in.nextLine());

          if(opNotas == 1){
             System.out.println(alunos.size());
             System.out.println("Escolha notas da Primeira Disciplina"
             +"\n 1 - Nota 1 "
             +"\n 2 - Nota 2 "
             +"\n 3 - Nota 3 ");
             int notasDisc1 = Integer.parseInt(in.nextLine());

             switch(notasDisc1){

              case 1: System.out.println(" Nota 1 será alterada !!");
              System.out.println("Digite a nota Desejada");
              double novaNota1 = Double.parseDouble(in.nextLine());

             // String novaNota1Str = String.valueOf(novaNota1);
             // aluno.setDisciplinas(novaNota1);
             disciplina.setNota1(novaNota1);
             }
          }

          
          if(opNotas == 2){
             System.out.println(alunos.size());
             System.out.println("Escolha notas da Primeira Disciplina"
             +"\n 1 - Nota 1 "
             +"\n 2 - Nota 2 "
             +"\n 3 - Nota 3 ");
             int notasDisc2 = Integer.parseInt(in.nextLine());

             switch(notasDisc2){

              case 1: System.out.println(" Nota 2 será alterada !!");
              System.out.println("Digite a nota Desejada");
              double novaNota2 = Double.parseDouble(in.nextLine());

             // String novaNota1Str = String.valueOf(novaNota1);
             // aluno.setDisciplinas(novaNota1);
             disciplina.setNota1(novaNota2);
             }
          }

             
          if(opNotas == 3){
             System.out.println(alunos.size());
             System.out.println("Escolha notas da Primeira Disciplina"
             +"\n 1 - Nota 1 "
             +"\n 2 - Nota 2 "
             +"\n 3 - Nota 3 ");
             int notasDisc3 = Integer.parseInt(in.nextLine());

             switch(notasDisc3){

              case 1: System.out.println(" Nota 3 será alterada !!");
              System.out.println("Digite a nota Desejada");
              double novaNota3 = Double.parseDouble(in.nextLine());

             // String novaNota1Str = String.valueOf(novaNota1);
             // aluno.setDisciplinas(novaNota1);
             disciplina.setNota1(novaNota3);
             }
          }
        }
      }
   }
}

    private static void resultadoAluno() {

         for (Aluno aluno  : alunos) {

         if(aluno.alunoAprovado1().equalsIgnoreCase(statusAluno.getAPROVADO())){
            if(aluno.alunoAprovado2().equalsIgnoreCase(statusAluno.getAPROVADO())){
               if(aluno.alunoAprovado3().equalsIgnoreCase(statusAluno.getAPROVADO())){
           }
         }
         alunosAprovados.add(aluno);
       }

       
       if(aluno.alunoAprovado1().equalsIgnoreCase(statusAluno.getRECUPERACAO())){
            if(aluno.alunoAprovado2().equalsIgnoreCase(statusAluno.getRECUPERACAO())){
               if(aluno.alunoAprovado3().equalsIgnoreCase(statusAluno.getRECUPERACAO())){
           }
         }
         alunosRecuperacao.add(aluno);
       }

       
       if(aluno.alunoAprovado1().equalsIgnoreCase(statusAluno.getREPROVADO())){
            if(aluno.alunoAprovado2().equalsIgnoreCase(statusAluno.getREPROVADO())){
               if(aluno.alunoAprovado3().equalsIgnoreCase(statusAluno.getREPROVADO())){
           }
         }
         alunosReprovados.add(aluno);
       }
        
    }        

        System.out.println("===================="
                           +"\n APROVADOS "
                       +"\n =====================");
        for (Aluno aluno1 : alunosAprovados) {
            
            System.out.println("Nome "+aluno1.getNomeAluno() 
            +"\n Resultado final " +aluno1.alunoAprovado1() +" : "+ aluno1.alunoAprovado2() +" : "+ aluno1.alunoAprovado3()
            +"\n Médias do ALuno : " +aluno1.calcularMedia1() +" : "+ aluno1.calcularMedia2() +" : "+ aluno1.calcularMedia3());
        }

               
        System.out.println("===================="
                           +"\n Recuperação "
                       +"\n =====================");
        for (Aluno aluno1 : alunosRecuperacao) {
            
            System.out.println("Nome "+aluno1.getNomeAluno() 
            +"\n Resultado final " +aluno1.alunoAprovado1() +" : "+ aluno1.alunoAprovado2() +" : "+ aluno1.alunoAprovado3()
            +"\n Médias do ALuno : " +aluno1.calcularMedia1() +" : "+ aluno1.calcularMedia2() +" : "+ aluno1.calcularMedia3());
        }

               
        System.out.println("===================="
                           +"\n Reprovados "
                       +"\n =====================");
        for (Aluno aluno1 : alunosReprovados) {
            
            System.out.println("Nome "+aluno1.getNomeAluno() 
            +"\n Resultado final " +aluno1.alunoAprovado1() +" : "+ aluno1.alunoAprovado2() +" : "+ aluno1.alunoAprovado3()
            +"\n Médias do ALuno : " +aluno1.calcularMedia1() +" : "+ aluno1.calcularMedia2() +" : "+ aluno1.calcularMedia3());
        }

            
      
    }

    private static void calculaMedia() {

      for (Aluno aluno  : alunos) {

       aluno.calcularMedia1();
       aluno.calcularMedia2();
       aluno.calcularMedia3();

      
    }

}

    public static void mostraDadosCadastrados() {
       //double media = calculaMedia();
        for (Aluno aluno  : alunos) {

            for (Disciplina disciplina : aluno.getDisciplinas()) {
                
              //  System.out.println(aluno.toString());
        
             System.out.println("Número da Matricuola : "+aluno.getMatricula()
                +"\n Nome do ALuno : "+aluno.getNomeAluno()
                +"\n Idade do ALuno : "+aluno.getIdade()
                +"\n Data de Nascimento : "+aluno.getDataNascimento()
                +"\n CPF : "+aluno.getCpf()
                +"\n Nome Da Mãe : "+aluno.getNomeMae()
                +"\n Nome do Pai : "+aluno.getNomePai()
                +"\n ============"
                +"\n Disciplinas "
                +"\n ============"
                +"\n Nome Da Primeira Disciplina : "+disciplina.getDisciplina1()
                +"\n Média da Primeira Disciplina : "+aluno.calcularMedia1()
                +"\n Nome Da Segunda Disciplina : "+disciplina.getDisciplina2()
                +"\n Média da Segunda Disciplina : "+aluno.calcularMedia2()
                +"\n Nome Da Terceira Disciplina : "+disciplina.getDisciplina3()
                +"\n Média da Terceira Disciplina : "+aluno.calcularMedia3());
           }
        }
    }

    private static void cadastrarAluno() {
        

        System.out.print("Informe o Número da Matricula  /*+qtdA+*/ ? : "); 
        int matricula = Integer.parseInt(in.nextLine());
        System.out.print("Qual o nome do Aluno  /*+qtdA+*/ ? : ");
        String nomeAluno = in.nextLine();
        System.out.print("Informe a Idade do Aluno  /*+qtdA+*/ ? : ");
        int idade = Integer.parseInt(in.nextLine());
        System.out.print("Informe a data de Nascimento do Aluno  /*+qtdA+*/ ? : ");
        String dataNascimento = in.nextLine();
        System.out.print("Informe ao Cpf  /*+qtdA+*/ ? : ");
        String cpf = in.nextLine();
        System.out.print("Informe o nome da Mãe  /*+qtdA+*/ ? : ");
        String nomeMae = in.nextLine();
        System.out.print("Informe o nome d Pai  /*+qtdA+*/ ? : ");
        String nomePai = in.nextLine();

          Aluno aluno = new Aluno(matricula,nomeAluno,idade,dataNascimento,cpf,nomeMae,nomePai);

              double nota1 = 0;
              double nota2 = 0;
              double nota3 = 0;

            System.out.print("Nome da Disciplina 1 ? : ");
            String disciplina1 = in.nextLine();

            for(int posN = 1; posN < 4; posN++){

            System.out.print("Nota "+posN+" ? : ");
            nota1 += Double.parseDouble(in.nextLine());
            }

            System.out.print("Nome da Disciplina 2 ? : ");
            String disciplina2 = in.nextLine();

            
            for(int posN = 1; posN < 4; posN++){

            System.out.print("Nota "+posN+" ? : ");
            nota2 += Double.parseDouble(in.nextLine());
            }


            System.out.print("Nome da Disciplina 3 ? : ");
            String disciplina3 = in.nextLine();

            
            for(int posN = 1; posN < 4; posN++){

            System.out.print("Nota "+posN+" ? : ");
            nota3 += Double.parseDouble(in.nextLine());
            }


             Disciplina disciplina = new Disciplina(disciplina1, disciplina2,disciplina3,nota1,nota2,nota3);
              
             aluno.getDisciplinas().add(disciplina);


         alunos.add(aluno);
    }
}
