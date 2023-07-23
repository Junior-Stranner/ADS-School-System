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
            System.out.println("Menu "
            +"\n 1 - Cadastrar Aluno "
            +"\n 2 - Calcula a Média"
            +"\n 3 - Mostrar Cadastro "
            +"\n 4 - Visualizar o Resultado do ALuno");
          op = Integer.parseInt(in.nextLine());

           switch(op){
            case 1: cadastrarAluno();break;
            case 2: calculaMedia();break;
            case 3: mostraDadosCadastrados();break;
            case 4: resultadoAluno();break;

           }
        }
    
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
    System.out.println("Erro ao executar o Menu");
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

    private static void mostraDadosCadastrados() {
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
