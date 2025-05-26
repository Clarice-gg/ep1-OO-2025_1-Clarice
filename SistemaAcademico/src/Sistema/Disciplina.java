package Sistema;
import static Sistema.Aluno.listaDeAlunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disciplina {
    private String nomeDaDisciplina;
    private String horario;
    private String professorResp;
    private String sala;
    private Integer creditos;
    private boolean metodo;
    private Integer tamanhoTurma;
    private Integer vagas;
    private boolean trancamento;
    List<Aluno> listaAlunosMatriculados = new ArrayList<>();
    
    public Disciplina(String nomeDaDisciplina, String horario, String professorResp, int creditos, boolean metodo, String sala, int tamanhoTurma){
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.horario = horario;
        this.professorResp = professorResp;
        this.creditos = creditos;
        this.metodo = metodo;
        this.sala = sala;
        this.tamanhoTurma = tamanhoTurma;
        this.vagas = tamanhoTurma;
        this.listaAlunosMatriculados = new ArrayList<>();
    }
    public Disciplina(){
        nomeDaDisciplina = "--";
        horario = "--";
        professorResp = "--";
        creditos = 0;
        metodo = true;
        sala = "--";
        tamanhoTurma = 0;
    }

    public String getNomeDaDisciplina(){
        return nomeDaDisciplina;
    }
    public void setNomeDaDisciplina(String nomeDisc){
        this.nomeDaDisciplina = nomeDisc;
    }

    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
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

    public boolean getMetodo(){
        return metodo;
    }
    public void setMetodo(boolean metodo){
        this.metodo = metodo;
    }

    public String getSala(){
        return sala;
    }
    public void setSala(String sala){
        this.sala = sala;
    }

    public Integer getTamanhoTurma(){
        return tamanhoTurma;
    }
    public void setTamanhoTurma(Integer tamanhoTurma){
        this.tamanhoTurma = tamanhoTurma;
    }

    public Integer getVagas(){
        return vagas;
    }
    public void setVagas(Integer vagas){
        this.vagas = vagas;
    }

    public boolean getTrancamento(){
        return trancamento;
    }
    public void setTrancamento(boolean trancamento){
        this.trancamento = trancamento;
    }
    public void setAlunosMatriculados(Aluno aluno){
        this.listaAlunosMatriculados.add(aluno);
    }

    private static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();

    public void criarDisciplina(){
        Scanner leitor = new Scanner(System.in);
        String nomeProf, nome, codigo, salinha;
        int carga, metodo, quantidade;
        boolean modo;

        System.out.println("--------CRIAÇÃO DE DISCIPLINA--------");
        System.out.println("Por favor, digite seu nome:");
        nomeProf = leitor.nextLine();
        setProfessorResp(nomeProf);
        System.out.println(nomeProf+", Qual o nome da disciplina desejada?");
        nome = leitor.nextLine();
        setNomeDaDisciplina(nome);
        System.out.println("Qual o horário desejado para a disciplina?\nPor favor, digite conforme o sistema de códigos do sistema");
        codigo = leitor.nextLine();
        setHorario(codigo);
        System.out.println("Qual a carga horária da disciplina?");
        carga = leitor.nextInt();
        setCreditos(carga);
        System.out.println("A turma será presencial ou remota?\nDigite 1 para presencial\nDigite 2 para remota");
        metodo = leitor.nextInt();
        if(metodo==1){
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Qual será a sala utilizada?");
            salinha = leitor2.nextLine();
            setSala(salinha);
            setMetodo(true);
            modo = true;
        }
        else {
            setMetodo(false);
            modo = false;
            salinha = "Remoto";
            setSala(salinha);
        }
        System.out.println("Qual será a quantidade máxima de alunos?");
        quantidade = leitor.nextInt();
        setTamanhoTurma(quantidade);
        setVagas(quantidade);

        Disciplina disciplina = new Disciplina(nome, codigo, nomeProf, carga, modo, salinha, quantidade);
        listaDeDisciplinas.add(disciplina);
    }

    public static ArrayList<Disciplina> getListaDisciplinas(){
        return listaDeDisciplinas;
    }

    public void matricularAluno(Aluno aluno) {
        listaAlunosMatriculados.add(aluno);
    }
    public void removerAluno(Aluno aluno) {
        listaAlunosMatriculados.remove(aluno);
    }

    public static boolean acharDisciplinaMatricula(String buscaDisciplina){
        for(Disciplina disciplina : listaDeDisciplinas){
            if(disciplina.getNomeDaDisciplina().equalsIgnoreCase(buscaDisciplina)){
                disciplina.setVagas(disciplina.vagas-=1);
                return true;
            }
        }
        return false;
    }

    public static boolean acharDisciplinaTrancar(String buscaDisciplina){
        for(Disciplina disciplina : listaDeDisciplinas){
            if(disciplina.getNomeDaDisciplina().equalsIgnoreCase(buscaDisciplina)){
                disciplina.setTrancamento(true);
                disciplina.setVagas(disciplina.vagas+=1);
                return true;
            }
        }
        return false;
    }

    public static boolean acharDisciplina(String buscaDisciplina){
        for(Disciplina disciplina : listaDeDisciplinas){
            if(disciplina.getNomeDaDisciplina().equalsIgnoreCase(buscaDisciplina)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Professor responsável: "+professorResp+
        " | Nome da disciplina: "+nomeDaDisciplina+" | Horário: "+horario+
        " | Sala: "+sala+" | Carga horária: "+creditos+" | Presencial: "+metodo+
        " | Quantidade de alunos: "+tamanhoTurma;
    }

    public static void matriculaEmDisciplina(){
        Scanner leitor = new Scanner(System.in);
        Disciplina disciplina = null;
        String nome, nomeAluno;
        int escolha;

        System.out.println("Por favor aluno(a), digite seu nome:");
        nomeAluno = leitor.nextLine();
        Aluno aluno = null;

        for(Aluno al : listaDeAlunos){
            if(al.getNome().equals(nomeAluno)){
                aluno = al;
                //listaAlunosMatriculados.add(al);
                break;
            }
        }
        if(aluno == null){
            System.out.println("Aluno não cadastrado no sistema");
        }
        else{
            if(AlunoEspecial.acharAlunoEspecial(nomeAluno)){
                System.out.println("Segue em lista as disciplinas existentes:");
                Disciplina.mostarListaDisciplinas();
                System.out.println("\nEm qual disciplina deseja se matricular?");
                System.out.println("- Observação: se a disciplina desejada ainda não existe, é necessário que um professor a crie antes");
                nome = leitor.nextLine();

                for(Disciplina d : listaDeDisciplinas){
                    if(d.getNomeDaDisciplina().equalsIgnoreCase(nome)){
                        disciplina = d;
                    }
                }
                if(disciplina == null){
                    System.out.println("Não foi possível encontar a disciplina!\n");
                }
                else{
                    disciplina.setAlunosMatriculados(aluno);
                    System.out.println("Matrícula efetuada com sucesso!\n"); 
                }
            }
            else{
                System.out.println("Segue em lista as disciplinas existentes:");
                Disciplina.mostarListaDisciplinas();
                System.out.println("\nEm qual disciplina deseja se matricular?");
                System.out.println("- Observação: se a disciplina desejada ainda não existe, é necessário que um professor a crie antes");
                nome = leitor.nextLine();

                for(Disciplina d : listaDeDisciplinas){
                    if(d.getNomeDaDisciplina().equalsIgnoreCase(nome)){
                        disciplina = d;
                    }
                }
                if(disciplina == null){
                    System.out.println("Não foi possível encontar a disciplina!\n");
                }
                else{
                    disciplina.setAlunosMatriculados(aluno);
                    System.out.println("Matrícula efetuada com sucesso!\n"); 
                }
            }
        }
    }

    public List<Aluno> getAlunosMatriculados(){
        return listaAlunosMatriculados;
    }

    public static void mostarListaDisciplinasGeral(){
        for(Disciplina d : listaDeDisciplinas){
            System.out.println(d);
            List<Aluno> alunos = d.getAlunosMatriculados();
            for(Aluno a : alunos){
                System.out.println("Aluno: "+a.getNome()+" | Matrícula: "+a.getMatricula());
            }
            System.out.print("\n");
        }
    }

    public static void mostarListaDisciplinas(){
        for(Disciplina d : listaDeDisciplinas){
            System.out.println(d);
        }
    }
}
