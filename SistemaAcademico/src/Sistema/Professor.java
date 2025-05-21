package Sistema;

public class Professor {
    private String matricula;
    private Integer disciplinasMinistradas;

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matr){
        this.matricula = matr;
    }
    public Integer getDisciplinasMinistradas(){
        return disciplinasMinistradas;
    }
    public void setDisciplinasMinistradas(Integer discMin){
        this.disciplinasMinistradas = discMin;
    }
}
