package Sistema;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private boolean trancarCurso;

    public Aluno(String nome){
        this.nome = nome;
    }
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }
    public Aluno(){
        this.nome = "nome";
        this.curso = "curso";
        this.matricula = 0;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matr){
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

    public static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    public static ArrayList<AlunoEspecial> listaAlunosE = new ArrayList<>();

    public void cadastrarAluno(){
        
        Scanner leitor = new Scanner(System.in);
        String nome, curso;
        int ano, anoM, semestre;
        int matriculaCriada=0;

        System.out.println("--------CADASTRO NO SISTEMA--------");
        System.out.println("Digite o seu nome:");
        nome = leitor.nextLine();
        setNome(nome);
        System.out.println("Digite o seu curso:");
        curso = leitor.nextLine();
        setCurso(curso);
        System.out.println("Qual o seu ano de entrada na Universidade?");
        ano = leitor.nextInt();
        anoM = ano % 100;
        System.out.println("Qual o seu semestre de início?");
        System.out.println("Digite 1 para o primeiro semestre do ano\nDigite 2 para o segundo semestre do ano");
        semestre = leitor.nextInt();

        //Cria a matrícula do aluno (aleatória)
        System.out.println("Sua nova matrícula é:");
        Random random = new Random();
        int[] vetor = new int[9];
        vetor[0] = anoM / 10;
        vetor[1] = anoM % 10;
        vetor[2] = semestre;
        vetor[3] = 0;
        for(int i=4; i<9; i++){
            vetor[i] = random.nextInt(10);
        }
        for(int d=0; d<9; d++){
            matriculaCriada = matriculaCriada*10 + vetor[d];
        }
        setMatricula(matriculaCriada);
        System.out.println(matriculaCriada + "\n");
        Aluno aluno = new Aluno(nome, curso, matriculaCriada);
        listaDeAlunos.add(aluno);
        int escolha;

        System.out.println("É um aluno especial? Digite 1 para sim e 2 para não");
            escolha = leitor.nextInt();
            if(escolha==1){
                AlunoEspecial alunoE = new AlunoEspecial(nome, curso, matriculaCriada, 0);
                listaAlunosE.add(alunoE);
            }
    }

    public ArrayList<Aluno> getListaAlunos(){
        return listaDeAlunos;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" | Curso: "+curso+" | Matricula: "+matricula;
    }

    public static void mostarListaAlunos(){
        for(Aluno aluno : listaDeAlunos){
            System.out.println(aluno);
        }
    }

    public static boolean acharAluno(String buscaAluno){
        for(Aluno aluno : listaDeAlunos){
            if(aluno.getNome().equalsIgnoreCase(buscaAluno)){
                return true;
            }}
        return false;
    }

    public static boolean acharAlunoTrancar(String buscaAluno){
        for(Aluno aluno : listaDeAlunos){
            if(aluno.getNome().equalsIgnoreCase(buscaAluno)){
                aluno.setTrancarCurso(true);
                return true;
            }}
        return false;
    }
    /*public static boolean acharAlunoNormal(String buscaAluno){
        for(Aluno aluno : listaAlunosN){
            if(aluno.getNome().equalsIgnoreCase(buscaAluno)){
                return true;
            }}
        return false;
    }
    public static boolean acharAlunoEspecial(String buscaAluno){
        for(Aluno aluno : listaAlunosE){
            if(aluno.getNome().equalsIgnoreCase(buscaAluno)){
                return true;
            }}
        return false;
    }*/
}
