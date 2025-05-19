package Sistema;

public class Disciplina {
    private String nomeDaDisciplina;
    private String turma;
    private String professorResp;
    private Integer creditos;
    private boolean trancamento;

    
    public String getNomeDaDisciplina(){
        return nomeDaDisciplina;
    }
    public void setNomeDaDisciplina(String nomeDisc){
        this.nomeDaDisciplina = nomeDisc;
    }

    public String getTurma(){
        return turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }

    public String getProfessorResp(){
        return professorResp;
    }
    public void setProfessorResp(String prof){
        this.professorResp = prof;
    }

    public Integer getCreditos(){
        return creditos;
    }
    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }

    public boolean getTrancamento(){
        return trancamento;
    }
    public void setTrancamento(boolean trancamento){
        this.trancamento = trancamento;
    }
}
