import java.util.Scanner;

import static Sistema.Aluno.listaDeAlunos;

import java.util.ArrayList;

import Sistema.Aluno;
import Sistema.Avaliacao;
import Sistema.Disciplina;
import Sistema.SalvarDados;

public class App {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int escolha;
        ArrayList<String> dados_alunos = new ArrayList<>();
        ArrayList<String> dados_turmas = new ArrayList<>();

        while(true){

            //-------------------------MENU PRINCIPAL-------------------------

            System.out.println("------------MENU PRINCIPAL------------\nSeja bem-vindo(a) ao mini Sigaa!");
            System.out.println("Escolha uma das opções abaixo para prosseguir:\n");
            System.out.println("[1]Acessar como aluno");
            System.out.println("[2]Acessar como professor");
            System.out.println("[3]Sair do sistema\n");

            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    menuAluno(); //redireciona para o menu aluno
                    break;
            
                case 2:
                    menuProfessor();
                    break;

                case 3:
                    System.out.println("Fechando sistema...\n");
                    leitor.close();
                    return;

                default:
                    System.out.println("Escolha inválida!\nPor favor, tente novamente\n");
                    //O programa espera 1 segundo para continuar
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                
            }
        }
    }

    //-------------------------MENU DO ALUNO-------------------------

    public static void menuAluno(){
        Scanner leitor = new Scanner(System.in);
        int escolha;
        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina();
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        String arquivoAluno = "Alunos.txt";

        while(true){
            System.out.println("------------MENU ALUNO------------");
            System.out.println("Olá aluno(a)!\nO que deseja fazer?\n");
            System.out.println("[1] Cadastro no sistema");
            System.out.println("[2] Matrícula em disciplina");
            System.out.println("[3] Trancar disciplina/semestre");
            System.out.println("[4] Salvar dados");
            System.out.println("[5] Retornar ao menu principal\n");

            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    aluno.cadastrarAluno();
                    System.out.println("Cadastro realizado com sucesso!\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    Disciplina.matriculaEmDisciplina();
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("O que deseja realizar?");
                    System.out.println("[1] Trancamento geral");
                    System.out.println("[2] Trancamento em uma disciplina\n");
                    escolha = leitor.nextInt();
                    if(escolha==1){
                        Scanner leitor1 = new Scanner(System.in);
                        String nome;
                        System.out.println("Por favor, digite seu nome:");
                        nome = leitor1.nextLine();
                        if(Aluno.acharAlunoTrancar(nome)){
                            System.out.println("Trancamento realizado!\n");
                        }
                        else{
                            System.out.println("Aluno não encontrado!");
                        }
                    }
                    else if(escolha==2){
                        String resposta;
                        Scanner leitor2 = new Scanner(System.in);
                        System.out.println("Qual disciplina deseja trancar?");
                        resposta = leitor2.nextLine(); //não está lendo (pq?)
                        if(Disciplina.acharDisciplinaTrancar(resposta)){
                            System.out.println("Disciplina: "+resposta+" trancada!\n");
                        }
                        else{
                            System.out.println("Não foi possível trancar a disciplina!\n");
                        }
                    }
                    else{
                        System.out.println("Escolha inválida!\n");
                    }
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    SalvarDados.escreverArquivoAlunos(arquivoAluno);
                    //Aluno.mostarListaAlunos();  //Dentro do sistema
                    System.out.println("\nDados salvos com sucesso!\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("Retornando ao menu principal, por favor aguarde...\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //leitor.close();
                    return;

                default:
                    System.out.println("Escolha inválida!\nPor favor, tente novamente");
            }
        }

    }

    //-------------------------MENU DO PROFESSOR-------------------------
    public static void menuProfessor(){
        Scanner leitor = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();
        ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();
        String arquivoDisciplinas = "Disciplinas.txt";
        int escolha;
        
        while(true){
            System.out.println("------------MENU PROFESSOR------------\n");
            System.out.println("Olá professor(a)! O que deseja fazer?");
            System.out.println("[1] Criar uma disciplina");
            System.out.println("[2] Verificar minhas disciplinas");
            System.out.println("[3] Modo de avaliação das disciplinas");
            System.out.println("[4] Salvar dados;");
            System.out.println("[5] Retornar ao menu principal\n");

            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    disciplina.criarDisciplina();
                    System.out.println("Disciplina cadastrada com sucesso!\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Disciplina.mostarListaDisciplinasGeral();
                    System.out.print("\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    int resposta;
                    System.out.println("O que deseja fazer?");
                    System.out.println("[1] Publicar notas");
                    System.out.println("[2] Verificar notas");
                    resposta = leitor.nextInt();

                    if(resposta==1){
                        Scanner leitor1 = new Scanner(System.in);
                        String nomeD;
                        System.out.println("Qual disciplina você deseja avaliar?");
                        nomeD = leitor1.nextLine();
                        if(Disciplina.acharDisciplina(nomeD)){
                            Avaliacao.modoDeAvaliacao();
                        }
                        else{
                            System.out.println("Disciplina não encontrada!\n");
                        }
                    }
                    else if(resposta==2){
                        Avaliacao.mostarListaDeNotas();
                    }
                    else{
                        System.out.println("Escolha inválida!\n");
                    }
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    SalvarDados.escreverArquivoDisciplinas(arquivoDisciplinas);
                    //Disciplina.mostarListaDisciplinasGeral(); //Dentro do sistema
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("\nDados salvos com sucesso!");
                    break;
                case 5:
                    System.out.println("Retornando ao menu principal, por favor aguarde...\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    return;
                default:
                    System.out.println("Escolha inválida! Tente novamente, por favor");
                    break;
            }
        }
    }

}
