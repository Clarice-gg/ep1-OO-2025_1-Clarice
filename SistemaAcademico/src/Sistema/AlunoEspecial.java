package Sistema;

public class AlunoEspecial {
    private Integer disciplinas;
    private boolean recebeNota;
    
    public AlunoEspecial(){
        this.disciplinas = 0;
        this.recebeNota = false;
    }

    public Integer getDisciplinas(){
        return disciplinas;
    }
    public void setDisciplinas(Integer disc){
        this.disciplinas = disc;
    }
    public boolean getRecebeNota(){
        return recebeNota;
    }
    public void setRecebeNota(boolean rNota){
        this.recebeNota = rNota;
    }
}
