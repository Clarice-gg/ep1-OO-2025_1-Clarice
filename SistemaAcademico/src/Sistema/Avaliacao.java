package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Avaliacao {
    public float nota;
    public float p1, p2, p3, l, s; 

    private Integer presenca;

    public Avaliacao(){
        nota = 0f;
        presenca = 0;
    }
    public Avaliacao(float p1, float p2, float p3, float l, float s, float nota){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.l = l;
        this.s = s;
        this.nota = nota;
    }

    public void setP1(float p1){this.p1 = p1;}
    public void setP2(float p2){this.p2 = p2;}
    public void setP3(float p3){this.p3 = p3;}
    public void setL(float l){this.l = l;}
    public void setS(float s){this.s = s;}

    public float getNota1(){
        return (p1+p2+p3+l+s)/5;
    }
    public float getNota2(){
        return (p1+p2*2+p3*3+l+s)/8;
    }
    public void setNota(float n){
        this.nota = n;
    }

    public Integer getPresenca(){
        return presenca;
    }
    public void setPresenca(Integer presenca){
        this.presenca = presenca;
    }

    private static ArrayList<Avaliacao> listaDeNotas = new ArrayList<>();

    public ArrayList<Avaliacao> getListaNotas(){
        return listaDeNotas;
    }

    public static void modo1(){
        Scanner leitor = new Scanner(System.in);
        float p1, p2, p3, l, s, notaFinal;
        Avaliacao a = new Avaliacao();

        System.out.println("Digite a nota da prova 1:");
        p1 = leitor.nextFloat();
        a.setP1(p1);
        System.out.println("Digite a nota da prova 2:");
        p2 = leitor.nextFloat();
        a.setP2(p2);
        System.out.println("Digite a nota da prova 3:");
        p3 = leitor.nextFloat();
        a.setP3(p3);
        System.out.println("Digite a nota da lista:");
        l = leitor.nextFloat();
        a.setL(l);
        System.out.println("Digite a nota do seminário:");
        s = leitor.nextFloat();
        a.setS(s);
        
        notaFinal = a.getNota1();
        a.setNota(notaFinal);
        Avaliacao avaliacao = new Avaliacao(p1, p2, p3, l, s, notaFinal);
        listaDeNotas.add(avaliacao);
    }

    public static void modo2(){
        Scanner leitor = new Scanner(System.in);
        float p1, p2, p3, l, s, notaFinal;
        Avaliacao a = new Avaliacao();
        System.out.println("Digite a nota da prova 1:");
        p1 = leitor.nextFloat();
        a.setP1(p1);
        System.out.println("Digite a nota da prova 2:");
        p2 = leitor.nextFloat();
        a.setP2(p2);
        System.out.println("Digite a nota da prova 3:");
        p3 = leitor.nextFloat();
        a.setP3(p3);
        System.out.println("Digite a nota da lista:");
        l = leitor.nextFloat();
        a.setL(l);
        System.out.println("Digite a nota do seminário:");
        s = leitor.nextFloat();
        a.setS(s);
        
        notaFinal = a.getNota2();
        a.setNota(notaFinal);
        Avaliacao avaliacao = new Avaliacao(p1, p2, p3, l, s, notaFinal);
        listaDeNotas.add(avaliacao);
    }

    public static void modoDeAvaliacao(){
        Scanner leitor = new Scanner(System.in);
        int escolha;

        System.out.println("Como deseja avaliar a turma?");
        System.out.println("[1] Modo de avaliação 1");
        System.out.println("[2] Modo de avaliação 2");
        System.out.println("Obs.: É necessário salvar as notas na ordem em que os alunos estão matriculados na disciplina");
        escolha = leitor.nextInt();
        if(escolha==1){
            Avaliacao.modo1();
            System.out.println("Notas salvas!\n");
        }
        else if (escolha==2){
            Avaliacao.modo2();
            System.out.println("Notas salvas!\n");
        }
        else{
            System.out.println("Escolha inválida!\n");
        }
    }

    @Override
    public String toString(){
        return "Nota final: "+nota;
    }

    public static void mostarListaDeNotas(){
        for(Avaliacao avaliacao : listaDeNotas){
            System.out.println(avaliacao);
        }
    }

    /*public static void mostarListaDeAlunos(){
        for(Aluno aluno : listaAlunosMatriculados){
            System.out.println(aluno);
        }
    }*/
}
