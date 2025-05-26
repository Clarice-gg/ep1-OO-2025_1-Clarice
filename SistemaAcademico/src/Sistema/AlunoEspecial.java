package Sistema;

public class AlunoEspecial extends Aluno{
    private Integer disciplinas=0;
    
    public AlunoEspecial(){
        this.disciplinas = 0;
    }
    public AlunoEspecial(String nome, String curso, int matricula, int disciplinas){
        super(nome, curso, matricula);
        this.disciplinas = disciplinas;
    }

    public Integer getDisciplinas(){
        return disciplinas;
    }
    public void setDisciplinas(Integer disc){
        this.disciplinas = disc;
    }

    public static boolean acharAlunoEspecial(String buscaAluno){
        for(AlunoEspecial aluno : listaAlunosE){
            if(aluno.getNome().equalsIgnoreCase(buscaAluno)){
                aluno.setDisciplinas(aluno.disciplinas+=1);
                return true;
            }}
        return false;
    }

    @Override
    public String toString(){
        return "Total de disciplinas matriculadas: "+disciplinas;
    }
}
