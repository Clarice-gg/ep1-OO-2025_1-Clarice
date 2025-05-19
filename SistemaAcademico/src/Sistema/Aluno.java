package Sistema;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matr){
        this.matricula = matr;
    }
    public String getCuso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
