import java.util.ArrayList;

public class Aluno {
    private int matricula;
    private String nomeAluno;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String nomeMae;
    private String nomePai;

  private ArrayList<Disciplina> disciplinas = new ArrayList<>();
private Disciplina disciplina = new Disciplina();

public double calcularMedia1(){
   double somaNota1 = 0;
   
   
    for (Disciplina disciplina : disciplinas) {
               somaNota1 += disciplina.getNota1();
    }
    return somaNota1 / 3;
}

public double calcularMedia2(){
   double somaNota2 = 0;
   
   
    for (Disciplina disciplina : disciplinas) {

        somaNota2 += disciplina.getNota2();
    }
    return somaNota2 / 3;

}

public double calcularMedia3(){
   double somaNota3 = 0;
   
   
    for (Disciplina disciplina : disciplinas) {

        somaNota3 += disciplina.getNota3();
    }
    return somaNota3 / 3;

}
public String alunoAprovado1(){

    double media1 = calcularMedia1();

    if(media1 >= 7){
        return statusAluno.getAPROVADO();
    }else if(media1 >= 5 && media1 < 7){
       return statusAluno.getRECUPERACAO();
    }else{
    return statusAluno.getREPROVADO();
    }
    /* double media (media >= 7) ?  Aprovado : Recuperação*/
}

public String alunoAprovado2(){

    double media2 = calcularMedia2();

    if(media2 >= 7){
        return statusAluno.getAPROVADO();
    }else if(media2 >= 5 && media2 < 7){
       return statusAluno.getRECUPERACAO();
    }else{
    return statusAluno.getREPROVADO();
    }
    /* double media (media >= 7) ?  Aprovado : Recuperação*/
}

public String alunoAprovado3(){

    double media3 = calcularMedia3();

    if(media3 >= 7){
        return statusAluno.getAPROVADO();
    }else if(media3 >= 5 && media3 < 7){
       return statusAluno.getRECUPERACAO();
    }else{
    return statusAluno.getREPROVADO();
    }
    /* double media (media >= 7) ?  Aprovado : Recuperação*/
}

public ArrayList<Disciplina> getDisciplinas() {
    return disciplinas;
}


public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
}


public Aluno(int matricula, String nomeAluno, int idade, String dataNascimento, String cpf, String nomeMae,
        String nomePai) {
    this.matricula = matricula;
    this.nomeAluno = nomeAluno;
    this.idade = idade;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.nomeMae = nomeMae;
    this.nomePai = nomePai;
}

public Aluno(){

}

    public int getMatricula() {
        return matricula;
    }

  public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;

    }
  /*   @Override
    public String toString() {
        return "Aluno" 
        + "\n [ matricula = " +matricula 
        + "\n nomeAluno = " +nomeAluno 
        + "\n idade = " +idade 
        + "\n dataNascimento = " +dataNascimento 
        + "\n cpf = " +cpf 
        + "\n nomeMae = " +nomeMae 
        + "\n nomePai = " +nomePai 
        + "\n disciplina 1 = " +disciplina.getDisciplina1()
        + "\n Média  da Disciplina 1 = " +calcularMedia1()
        + "\n disciplina 2 = " +disciplina.getDisciplina2()
        + "\n Média  da Disciplina 2 = " +calcularMedia2()
        + "\n disciplina 3 = " +disciplina.getDisciplina3()
        + "\n Média  da Disciplina 3 = " +calcularMedia3();
    }*/


}
