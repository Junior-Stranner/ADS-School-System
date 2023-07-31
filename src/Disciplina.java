
public class Disciplina {
   private String disciplina1;
   private String disciplina2;
   private String disciplina3;
   private double nota1;
   private double nota2;
   private double nota3;

   public Disciplina(){
    
   }

   


public Disciplina(String disciplina1, String disciplina2, String disciplina3, double nota1, double nota2,
        double nota3) {
    this.disciplina1 = disciplina1;
    this.disciplina2 = disciplina2;
    this.disciplina3 = disciplina3;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
}




public String getDisciplina1() {
    return disciplina1;
}

public void setDisciplina1(String disciplina1) {
    this.disciplina1 = disciplina1;
}

public String getDisciplina2() {
    return disciplina2;
}

public void setDisciplina2(String disciplina2) {
    this.disciplina2 = disciplina2;
}

public String getDisciplina3() {
    return disciplina3;
}

public void setDisciplina3(String disciplina3) {
    this.disciplina3 = disciplina3;
}

public double getNota1() {
    return nota1;
}

public void setNota1(double nota1) {
    this.nota1 = nota1;
}

public double getNota2() {
    return nota2;
}

public void setNota2(double nota2) {
    this.nota2 = nota2;
}

public double getNota3() {
    return nota3;
}

public void setNota3(double nota3) {
    this.nota3 = nota3;
}




@Override
public String toString() {
    return "Disciplina [disciplina1=" + disciplina1 
    + ", disciplina2=" + disciplina2 
    + ", disciplina3=" + disciplina3
    + ", nota1=" + nota1 
    + ", nota2=" + nota2 
    + ", nota3=" + nota3 + "]";
}
  
 }