package Sistema;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private boolean trancarCurso;

    public Aluno(){
        this.nome = "nome";
        this.matricula = "--";
        this.curso = "curso";
    }

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
    public boolean getTrancarCurso(){
        return trancarCurso;
    }
    public void setTrancarCurso(boolean trCurso){
        this.trancarCurso = trCurso;
    }

    public static void cadastrarAluno(){
        System.out.println("--------CADASTRO NO SISTEMA--------");
        System.out.println("");
    }
    //---------------------LISTA DE ALUNOS (DADOS)--------------------

    
}
