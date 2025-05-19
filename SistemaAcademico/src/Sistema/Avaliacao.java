package Sistema;

public class Avaliacao {
    public float nota1;
    nota1 = (p1 + p2 + p3 + l + s) / 5;
    public float nota2;
    nota2 = (p1 + 2*p2 + 3*p3 + l + s) / 8;

    private Integer presenca;

    
    public Integer getPresenca(){
        return presenca;
    }
    public void setPresenca(Integer presenca){
        this.presenca = presenca;
    }
}
